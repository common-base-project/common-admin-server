

package top.mybi.modules.log.service;


import top.mybi.common.page.PageData;
import top.mybi.common.service.BaseService;
import top.mybi.modules.log.dto.SysLogErrorDTO;
import top.mybi.modules.log.entity.SysLogErrorEntity;

import java.util.List;
import java.util.Map;

/**
 * 异常日志
 *
 * @author Mustang mustang2247@gmail.com
 * @since 1.0.0
 */
public interface SysLogErrorService extends BaseService<SysLogErrorEntity> {

    PageData<SysLogErrorDTO> page(Map<String, Object> params);

    List<SysLogErrorDTO> list(Map<String, Object> params);

    void save(SysLogErrorEntity entity);

}