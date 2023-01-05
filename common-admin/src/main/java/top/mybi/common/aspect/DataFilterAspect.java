

package top.mybi.common.aspect;

import cn.hutool.core.collection.CollUtil;
import top.mybi.common.annotation.DataFilter;
import top.mybi.common.constant.Constant;
import top.mybi.common.exception.ErrorCode;
import top.mybi.common.exception.RenException;
import top.mybi.common.interceptor.DataScope;
import top.mybi.modules.security.user.SecurityUser;
import top.mybi.modules.security.user.UserDetail;
import top.mybi.modules.sys.enums.SuperAdminEnum;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * 数据过滤，切面处理类
 *
 * @author Mustang mustang2247@gmail.com
 */
@Aspect
@Component
public class DataFilterAspect {

    @Pointcut("@annotation(top.mybi.common.annotation.DataFilter)")
    public void dataFilterCut() {

    }

    @Before("dataFilterCut()")
    public void dataFilter(JoinPoint point) {
        Object params = point.getArgs()[0];
        if(params != null && params instanceof Map){
            UserDetail user = SecurityUser.getUser();

            //如果是超级管理员，则不进行数据过滤
            if(user.getSuperAdmin() == SuperAdminEnum.YES.value()) {
                return ;
            }

            try {
                //否则进行数据过滤
                Map map = (Map)params;
                String sqlFilter = getSqlFilter(user, point);
                map.put(Constant.SQL_FILTER, new DataScope(sqlFilter));
            }catch (Exception e){

            }

            return ;
        }

        throw new RenException(ErrorCode.DATA_SCOPE_PARAMS_ERROR);
    }

    /**
     * 获取数据过滤的SQL
     */
    private String getSqlFilter(UserDetail user, JoinPoint point) throws Exception {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = point.getTarget().getClass().getDeclaredMethod(signature.getName(), signature.getParameterTypes());
        DataFilter dataFilter = method.getAnnotation(DataFilter.class);

        //获取表的别名
        String tableAlias = dataFilter.tableAlias();
        if(StringUtils.isNotBlank(tableAlias)){
            tableAlias +=  ".";
        }

        StringBuilder sqlFilter = new StringBuilder();
        sqlFilter.append(" (");

        //部门ID列表
        List<Long> deptIdList = user.getDeptIdList();
        if(CollUtil.isNotEmpty(deptIdList)){
            sqlFilter.append(tableAlias).append(dataFilter.deptId());

            sqlFilter.append(" in(").append(StringUtils.join(deptIdList, ",")).append(")");
        }

        //查询本人数据
        if(CollUtil.isNotEmpty(deptIdList)){
            sqlFilter.append(" or ");
        }
        sqlFilter.append(tableAlias).append(dataFilter.userId()).append("=").append(user.getId());

        sqlFilter.append(")");

        return sqlFilter.toString();
    }
}