package com.yidongzhineng.dxc.mapper;

import com.yidongzhineng.dxc.pojo.ConllctionExample;
import com.yidongzhineng.dxc.pojo.ConllctionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConllctionMapper {
    int countByExample(ConllctionExample example);

    int deleteByExample(ConllctionExample example);

    int deleteByPrimaryKey(ConllctionKey key);

    int insert(ConllctionKey record);

    int insertSelective(ConllctionKey record);

    List<ConllctionKey> selectByExample(ConllctionExample example);

    int updateByExampleSelective(@Param("record") ConllctionKey record, @Param("example") ConllctionExample example);

    int updateByExample(@Param("record") ConllctionKey record, @Param("example") ConllctionExample example);
}