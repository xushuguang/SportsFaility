package com.james.dao;

import com.james.pojo.po.SFAppointment;
import com.james.pojo.po.SFAppointmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SFAppointmentMapper {
    int countByExample(SFAppointmentExample example);

    int deleteByExample(SFAppointmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SFAppointment record);

    int insertSelective(SFAppointment record);

    List<SFAppointment> selectByExample(SFAppointmentExample example);

    SFAppointment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SFAppointment record, @Param("example") SFAppointmentExample example);

    int updateByExample(@Param("record") SFAppointment record, @Param("example") SFAppointmentExample example);

    int updateByPrimaryKeySelective(SFAppointment record);

    int updateByPrimaryKey(SFAppointment record);
}