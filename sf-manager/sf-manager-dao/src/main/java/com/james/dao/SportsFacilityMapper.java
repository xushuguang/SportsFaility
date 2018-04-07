package com.james.dao;

import com.james.pojo.po.SportsFacility;
import com.james.pojo.po.SportsFacilityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SportsFacilityMapper {
    int countByExample(SportsFacilityExample example);

    int deleteByExample(SportsFacilityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SportsFacility record);

    int insertSelective(SportsFacility record);

    List<SportsFacility> selectByExample(SportsFacilityExample example);

    SportsFacility selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SportsFacility record, @Param("example") SportsFacilityExample example);

    int updateByExample(@Param("record") SportsFacility record, @Param("example") SportsFacilityExample example);

    int updateByPrimaryKeySelective(SportsFacility record);

    int updateByPrimaryKey(SportsFacility record);
}