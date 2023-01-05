

package top.mybi.modules.job.service;

import top.mybi.common.page.PageData;
import top.mybi.common.service.BaseService;
import top.mybi.modules.job.dto.ScheduleJobLogDTO;
import top.mybi.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author Mustang mustang2247@gmail.com
 */
public interface ScheduleJobLogService extends BaseService<ScheduleJobLogEntity> {

	PageData<ScheduleJobLogDTO> page(Map<String, Object> params);

	ScheduleJobLogDTO get(Long id);
}
