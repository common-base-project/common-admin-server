

package top.mybi.modules.log.dao;

import top.mybi.common.dao.BaseDao;
import top.mybi.modules.log.entity.SysLogErrorEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 异常日志
 *
 * @author Mustang mustang2247@gmail.com
 * @since 1.0.0
 */
@Mapper
public interface SysLogErrorDao extends BaseDao<SysLogErrorEntity> {
	
}
