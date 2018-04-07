package com.james.web;

import com.james.pojo.po.User;
import com.james.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: 57140
 * Date: 2018/3/19
 * Time: 12:28
 * Version:V1.0
 */
@Controller
public class LoginAction {
    @Autowired
    private LoginService loginService;

    @ResponseBody
    @RequestMapping(value = "/login/login",method = RequestMethod.POST)
    public User register(User user){
        return loginService.login(user);
    }
}
