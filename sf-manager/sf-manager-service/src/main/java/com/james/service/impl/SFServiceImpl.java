package com.james.service.impl;

import com.james.dao.SportsFacilityCustomMapper;
import com.james.dao.SportsFacilityMapper;
import com.james.pojo.po.SportsFacility;
import com.james.service.SFService;
import com.james.dto.Order;
import com.james.dto.Page;
import com.james.dto.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: 57140
 * Date: 2018/3/21
 * Time: 14:07
 * Version:V1.0
 */
@Service
public class SFServiceImpl implements SFService{

    @Autowired
    private SportsFacilityMapper sportsFacilityDao;
    @Autowired
    SportsFacilityCustomMapper sportsFacilityCustomDao;
    @Override
    public int addSF(SportsFacility sportsFacility) {
        sportsFacility.setDamage("N");
        int i = sportsFacilityDao.insert(sportsFacility);
        return i;
    }

    @Override
    public Result<SportsFacility> listSF(Page page, Order order) {
        //封装一个map
        Map<String,Object> map = new HashMap<>();
        map.put("order",order);
        map.put("page",page);
        Result<SportsFacility> result = new Result<>();
        long total = sportsFacilityCustomDao.countSFs(map);
        List<SportsFacility> sportsFacilities = sportsFacilityCustomDao.listSFs(map);
        result.setTotal(total);
        result.setRows(sportsFacilities);
        return result;
    }
}
