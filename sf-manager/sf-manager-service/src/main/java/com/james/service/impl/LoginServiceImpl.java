package com.james.service.impl;

import com.james.dao.UserMapper;
import com.james.pojo.po.User;
import com.james.pojo.po.UserExample;
import com.james.service.LoginService;
import com.james.utils.MD5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: 57140
 * Date: 2018/3/19
 * Time: 12:29
 * Version:V1.0
 */
@Service
public class LoginServiceImpl implements LoginService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserMapper userDao;

    /**
     * 登录
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        User user1 = null;
        try {
            UserExample example = new UserExample();
            example.createCriteria().andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(MD5Util.MD5(user.getPassword()));
            user1 = userDao.selectByExample(example).get(0);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return user1;
    }
}
