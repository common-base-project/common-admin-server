

package top.mybi.modules.log.service;

import top.mybi.common.page.PageData;
import top.mybi.common.service.BaseService;
import top.mybi.modules.log.dto.SysLogOperationDTO;
import top.mybi.modules.log.entity.SysLogOperationEntity;

import java.util.List;
import java.util.Map;

/**
 * 操作日志
 *
 * @author Mustang mustang2247@gmail.com
 * @since 1.0.0
 */
public interface SysLogOperationService extends BaseService<SysLogOperationEntity> {

    PageData<SysLogOperationDTO> page(Map<String, Object> params);

    List<SysLogOperationDTO> list(Map<String, Object> params);

    void save(SysLogOperationEntity entity);
}