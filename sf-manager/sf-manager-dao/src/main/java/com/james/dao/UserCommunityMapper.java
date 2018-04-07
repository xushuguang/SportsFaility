package com.james.dao;

import com.james.pojo.po.UserCommunity;
import com.james.pojo.po.UserCommunityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCommunityMapper {
    int countByExample(UserCommunityExample example);

    int deleteByExample(UserCommunityExample example);

    int insert(UserCommunity record);

    int insertSelective(UserCommunity record);

    List<UserCommunity> selectByExample(UserCommunityExample example);

    int updateByExampleSelective(@Param("record") UserCommunity record, @Param("example") UserCommunityExample example);

    int updateByExample(@Param("record") UserCommunity record, @Param("example") UserCommunityExample example);
}