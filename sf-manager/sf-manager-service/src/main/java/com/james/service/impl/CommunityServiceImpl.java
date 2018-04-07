package com.james.service.impl;

import com.james.dao.CommunityCustomMapper;
import com.james.dao.CommunityMapper;
import com.james.dto.Order;
import com.james.dto.Page;
import com.james.dto.Result;
import com.james.pojo.po.Community;
import com.james.service.CommunityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: 57140
 * Date: 2018/4/5
 * Time: 15:39
 * Version:V1.0
 */
@Service
public class CommunityServiceImpl implements CommunityService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CommunityMapper communityDao;
    @Autowired
    private CommunityCustomMapper communityCustomDao;
    @Override
    public int addCommunity(Community community) {
        int result = 0;
        try {
            result = communityDao.insert(community);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result<Community> listCommunity(Page page, Order order) {
        Result<Community> result = null;
        try {
            //封装一个map
            Map<String,Object> map = new HashMap<>();
            map.put("order",order);
            map.put("page",page);
            result = new Result<>();
            long total = communityCustomDao.countCommunitys(map);
            List<Community> communities = communityCustomDao.listCommunitys(map);
            result.setTotal(total);
            result.setRows(communities);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;

    }
}
