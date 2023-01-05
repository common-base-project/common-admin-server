

package top.mybi.modules.sys.dao;

import top.mybi.common.dao.BaseDao;
import top.mybi.modules.sys.entity.DictData;
import top.mybi.modules.sys.entity.SysDictDataEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 字典数据
 *
 * @author Mustang mustang2247@gmail.com
 */
@Mapper
public interface SysDictDataDao extends BaseDao<SysDictDataEntity> {

    /**
     * 字典数据列表
     */
    List<DictData> getDictDataList();
}
