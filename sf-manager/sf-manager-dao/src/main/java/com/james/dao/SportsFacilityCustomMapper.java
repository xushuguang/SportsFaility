package com.james.dao;

import com.james.pojo.po.SportsFacility;

import java.util.List;
import java.util.Map;

public interface SportsFacilityCustomMapper {
    /**
     * 符合条件的总记录数
     * @return
     */
    long countSFs(Map<String,Object> map);

    /**
     * 指定页码的记录集合
     * @return
     */
    List<SportsFacility> listSFs(Map<String,Object> map);
}