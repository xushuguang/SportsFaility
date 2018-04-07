package com.james.dao;

import com.james.pojo.po.Community;

import java.util.List;
import java.util.Map;

public interface CommunityCustomMapper {
    /**
     * 符合条件的总记录数
     * @return
     */
    long countCommunitys(Map<String,Object> map);

    /**
     * 指定页码的记录集合
     * @return
     */
    List<Community> listCommunitys(Map<String,Object> map);
}