package com.james.service.impl;

import com.james.dao.CommunityMapper;
import com.james.dao.UserCommunityMapper;
import com.james.dao.UserMapper;
import com.james.dto.Order;
import com.james.dto.Page;
import com.james.dto.Result;
import com.james.pojo.po.User;
import com.james.pojo.po.UserCommunityExample;
import com.james.pojo.po.UserExample;
import com.james.pojo.vo.UserVo;
import com.james.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: 57140
 * Date: 2018/4/7
 * Time: 17:08
 * Version:V1.0
 */
@Service
public class UserServiceImpl implements UserService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserMapper userDao;
    private CommunityMapper communityDao;
    private UserCommunityMapper userCommunityDao;
    @Override
    public Result<UserVo> listUserVo(Page page, Order order) {
        Result<UserVo> result = null;
        try {
            //封装一个map
            Map<String,Object> map = new HashMap<>();
            map.put("order",order);
            map.put("page",page);
            result = new Result<>();
            UserVo userVo = new UserVo();
            userVo.setUsername("JamesLi");
            userVo.setMobile("15695713696");
            userVo.setAddress("宁东北苑1栋一单元101");
            List<UserVo> list = new ArrayList<>();
            list.add(userVo);
            result.setTotal(1L);
            result.setRows(list);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }
}