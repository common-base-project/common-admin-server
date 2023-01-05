

package top.mybi.modules.sys.dao;

import top.mybi.common.dao.BaseDao;
import top.mybi.modules.sys.entity.DictType;
import top.mybi.modules.sys.entity.SysDictTypeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 字典类型
 *
 * @author Mustang mustang2247@gmail.com
 */
@Mapper
public interface SysDictTypeDao extends BaseDao<SysDictTypeEntity> {

    /**
     * 字典类型列表
     */
    List<DictType> getDictTypeList();

}
