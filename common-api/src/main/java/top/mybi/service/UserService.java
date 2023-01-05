

package top.mybi.service;

import top.mybi.common.service.BaseService;
import top.mybi.entity.UserEntity;
import top.mybi.dto.LoginDTO;

import java.util.Map;

/**
 * 用户
 * 
 * @author Mustang mustang2247@gmail.com
 */
public interface UserService extends BaseService<UserEntity> {

	UserEntity getByMobile(String mobile);

	UserEntity getUserByUserId(Long userId);

	/**
	 * 用户登录
	 * @param dto    登录表单
	 * @return        返回登录信息
	 */
	Map<String, Object> login(LoginDTO dto);
}
