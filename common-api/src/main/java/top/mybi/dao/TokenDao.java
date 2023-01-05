package top.mybi.dao;

import top.mybi.common.dao.BaseDao;
import top.mybi.entity.TokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Token
 * 
 * @author Mustang mustang2247@gmail.com
 */
@Mapper
public interface TokenDao extends BaseDao<TokenEntity> {
    TokenEntity getByToken(String token);

    TokenEntity getByUserId(Long userId);
}
