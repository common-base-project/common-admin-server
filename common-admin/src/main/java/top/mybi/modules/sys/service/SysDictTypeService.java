

package top.mybi.modules.sys.service;

import top.mybi.common.page.PageData;
import top.mybi.common.service.BaseService;
import top.mybi.modules.sys.dto.SysDictTypeDTO;
import top.mybi.modules.sys.entity.DictType;
import top.mybi.modules.sys.entity.SysDictTypeEntity;

import java.util.List;
import java.util.Map;

/**
 * 数据字典
 *
 * @author Mustang mustang2247@gmail.com
 */
public interface SysDictTypeService extends BaseService<SysDictTypeEntity> {

    PageData<SysDictTypeDTO> page(Map<String, Object> params);

    SysDictTypeDTO get(Long id);

    void save(SysDictTypeDTO dto);

    void update(SysDictTypeDTO dto);

    void delete(Long[] ids);

    /**
     * 获取所有字典
     */
    List<DictType> getAllList();

}