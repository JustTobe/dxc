package com.yidongzhineng.dxc.Mapper;

import com.yidongzhineng.dxc.POJO.Service;
import com.yidongzhineng.dxc.POJO.ServiceExample;
import com.yidongzhineng.dxc.POJO.ServiceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceMapper {
    int countByExample(ServiceExample example);

    int deleteByExample(ServiceExample example);

    int deleteByPrimaryKey(ServiceKey key);

    int insert(Service record);

    int insertSelective(Service record);

    List<Service> selectByExample(ServiceExample example);

    Service selectByPrimaryKey(ServiceKey key);

    int updateByExampleSelective(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByExample(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
}