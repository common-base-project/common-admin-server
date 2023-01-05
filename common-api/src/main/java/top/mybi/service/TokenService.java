

package top.mybi.service;

import top.mybi.common.service.BaseService;
import top.mybi.entity.TokenEntity;

/**
 * 用户Token
 * 
 * @author Mustang mustang2247@gmail.com
 */
public interface TokenService extends BaseService<TokenEntity> {

	TokenEntity getByToken(String token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 * @return        返回token信息
	 */
	TokenEntity createToken(Long userId);

	/**
	 * 设置token过期
	 * @param userId 用户ID
	 */
	void expireToken(Long userId);

}
