

package top.mybi.modules.log.service;

import top.mybi.common.page.PageData;
import top.mybi.common.service.BaseService;
import top.mybi.modules.log.dto.SysLogLoginDTO;
import top.mybi.modules.log.entity.SysLogLoginEntity;

import java.util.List;
import java.util.Map;

/**
 * 登录日志
 *
 * @author Mustang mustang2247@gmail.com
 * @since 1.0.0
 */
public interface SysLogLoginService extends BaseService<SysLogLoginEntity> {

    PageData<SysLogLoginDTO> page(Map<String, Object> params);

    List<SysLogLoginDTO> list(Map<String, Object> params);

    void save(SysLogLoginEntity entity);
}