

package top.mybi.modules.sys.service;


import top.mybi.common.page.PageData;
import top.mybi.common.service.BaseService;
import top.mybi.modules.sys.dto.SysParamsDTO;
import top.mybi.modules.sys.entity.SysParamsEntity;

import java.util.List;
import java.util.Map;

/**
 * 参数管理
 *
 * @author Mustang mustang2247@gmail.com
 * @since 1.0.0
 */
public interface SysParamsService extends BaseService<SysParamsEntity> {

    PageData<SysParamsDTO> page(Map<String, Object> params);

    List<SysParamsDTO> list(Map<String, Object> params);

    SysParamsDTO get(Long id);

    void save(SysParamsDTO dto);

    void update(SysParamsDTO dto);

    void delete(Long[] ids);

    /**
     * 根据参数编码，获取参数的value值
     *
     * @param paramCode  参数编码
     */
    String getValue(String paramCode);

    /**
     * 根据参数编码，获取value的Object对象
     * @param paramCode  参数编码
     * @param clazz  Object对象
     */
    <T> T getValueObject(String paramCode, Class<T> clazz);

    /**
     * 根据参数编码，更新value
     * @param paramCode  参数编码
     * @param paramValue  参数值
     */
    int updateValueByCode(String paramCode, String paramValue);
}
