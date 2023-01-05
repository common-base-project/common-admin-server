

package top.mybi.modules.sys.service;

import top.mybi.common.service.BaseService;
import top.mybi.modules.security.user.UserDetail;
import top.mybi.modules.sys.dto.SysMenuDTO;
import top.mybi.modules.sys.entity.SysMenuEntity;

import java.util.List;


/**
 * 菜单管理
 * 
 * @author Mustang mustang2247@gmail.com
 */
public interface SysMenuService extends BaseService<SysMenuEntity> {

	SysMenuDTO get(Long id);

	void save(SysMenuDTO dto);

	void update(SysMenuDTO dto);

	void delete(Long id);

	/**
	 * 菜单列表
	 *
	 * @param menuType 菜单类型
	 */
	List<SysMenuDTO> getAllMenuList(Integer menuType);

	/**
	 * 用户菜单列表
	 *
	 * @param user  用户
	 * @param menuType 菜单类型
	 */
	List<SysMenuDTO> getUserMenuList(UserDetail user, Integer menuType);

	/**
	 * 根据父菜单，查询子菜单
	 * @param pid  父菜单ID
	 */
	List<SysMenuDTO> getListPid(Long pid);
}
