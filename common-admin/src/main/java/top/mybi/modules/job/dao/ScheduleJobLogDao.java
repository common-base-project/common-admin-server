

package top.mybi.modules.job.dao;

import top.mybi.common.dao.BaseDao;
import top.mybi.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author Mustang mustang2247@gmail.com
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
