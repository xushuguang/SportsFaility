package com.james.web;

import com.james.dto.Order;
import com.james.dto.Page;
import com.james.dto.Result;
import com.james.pojo.vo.UserVo;
import com.james.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: 57140
 * Date: 2018/4/7
 * Time: 17:05
 * Version:V1.0
 */
@Controller
public class UserAction {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping(value = "/user/listUserVo",method = RequestMethod.GET)
    public Result<UserVo> listUserVo(Page page, Order order){
        Result<UserVo> result = null;
        try {
            result = userService.listUserVo(page,order);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }
}
