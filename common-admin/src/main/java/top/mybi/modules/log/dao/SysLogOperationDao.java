

package top.mybi.modules.log.dao;

import top.mybi.common.dao.BaseDao;
import top.mybi.modules.log.entity.SysLogOperationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 操作日志
 *
 * @author Mustang mustang2247@gmail.com
 * @since 1.0.0
 */
@Mapper
public interface SysLogOperationDao extends BaseDao<SysLogOperationEntity> {
	
}
