

package top.mybi.modules.sys.service;

import top.mybi.common.page.PageData;
import top.mybi.common.service.BaseService;
import top.mybi.modules.sys.dto.SysDictDataDTO;
import top.mybi.modules.sys.entity.SysDictDataEntity;

import java.util.Map;

/**
 * 数据字典
 *
 * @author Mustang mustang2247@gmail.com
 */
public interface SysDictDataService extends BaseService<SysDictDataEntity> {

    PageData<SysDictDataDTO> page(Map<String, Object> params);

    SysDictDataDTO get(Long id);

    void save(SysDictDataDTO dto);

    void update(SysDictDataDTO dto);

    void delete(Long[] ids);

}