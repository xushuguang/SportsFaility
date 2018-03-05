package com.james.service.impl;

import com.james.dao.UserMapper;
import com.james.pojo.po.User;
import com.james.pojo.po.UserExample;
import com.james.service.RegisterService;
import com.james.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: 57140
 * Date: 2018/3/5
 * Time: 20:09
 * Version:V1.0
 */
@Service
public class RegisterServiceImpl implements RegisterService{
    @Autowired
    private UserMapper userDao;
    /**
     * 验证用户名是否存在
     * @param username
     * @return
     */
    @Override
    public boolean selectUsername(String username) {
        boolean flag = true;
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<User> users = userDao.selectByExample(example);
        if (users != null && users.size()>0){
            flag = false;
        }
        return flag;
    }

    /**
     * 验证手机号是否已被注册
     * @param mobile
     * @return
     */
    @Override
    public boolean selectMobile(String mobile) {
        boolean flag = true;
        UserExample example = new UserExample();
        example.createCriteria().andMobileEqualTo(mobile);
        List<User> users = userDao.selectByExample(example);
        if (users != null && users.size()>0){
            flag = false;
        }
        return flag;
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @Override
    public int register(User user) {
        //MD5加密
        user.setPassword(MD5Util.MD5(user.getPassword()));
        //设置标识
        user.setComment("user");
        //保存
        int i = userDao.insert(user);
        return i;
    }
}
