package top.mybi.dao;

import top.mybi.common.dao.BaseDao;
import top.mybi.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * 
 * @author Mustang mustang2247@gmail.com
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity> {
    UserEntity getUserByMobile(String mobile);

    UserEntity getUserByUserId(Long userId);
}
