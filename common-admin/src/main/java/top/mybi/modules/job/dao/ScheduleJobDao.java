

package top.mybi.modules.job.dao;

import top.mybi.common.dao.BaseDao;
import top.mybi.modules.job.entity.ScheduleJobEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 定时任务
 *
 * @author Mustang mustang2247@gmail.com
 */
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
