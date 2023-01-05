

package top.mybi.modules.security.service;

import top.mybi.common.service.BaseService;
import top.mybi.common.utils.Result;
import top.mybi.modules.security.entity.SysUserTokenEntity;

/**
 * 用户Token
 * 
 * @author Mustang mustang2247@gmail.com
 */
public interface SysUserTokenService extends BaseService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	Result createToken(Long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(Long userId);

}