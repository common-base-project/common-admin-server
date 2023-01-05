

package top.mybi.modules.sys.service;


import top.mybi.common.page.PageData;
import top.mybi.common.service.BaseService;
import top.mybi.modules.sys.dto.SysRoleDTO;
import top.mybi.modules.sys.entity.SysRoleEntity;

import java.util.List;
import java.util.Map;


/**
 * 角色
 * 
 * @author Mustang mustang2247@gmail.com
 */
public interface SysRoleService extends BaseService<SysRoleEntity> {

	PageData<SysRoleDTO> page(Map<String, Object> params);

	List<SysRoleDTO> list(Map<String, Object> params);

	SysRoleDTO get(Long id);

	void save(SysRoleDTO dto);

	void update(SysRoleDTO dto);

	void delete(Long[] ids);

}
