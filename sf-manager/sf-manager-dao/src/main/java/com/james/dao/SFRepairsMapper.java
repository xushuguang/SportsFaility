package com.james.dao;

import com.james.pojo.po.SFRepairs;
import com.james.pojo.po.SFRepairsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SFRepairsMapper {
    int countByExample(SFRepairsExample example);

    int deleteByExample(SFRepairsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SFRepairs record);

    int insertSelective(SFRepairs record);

    List<SFRepairs> selectByExample(SFRepairsExample example);

    SFRepairs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SFRepairs record, @Param("example") SFRepairsExample example);

    int updateByExample(@Param("record") SFRepairs record, @Param("example") SFRepairsExample example);

    int updateByPrimaryKeySelective(SFRepairs record);

    int updateByPrimaryKey(SFRepairs record);
}