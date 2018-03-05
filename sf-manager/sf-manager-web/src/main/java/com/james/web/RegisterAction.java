package com.james.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.james.pojo.po.User;
import com.james.service.RegisterService;
import com.james.utils.AuthCodeUtil;
import com.james.utils.SMSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * User: 57140
 * Date: 2018/3/4
 * Time: 19:24
 * Version:V1.0
 */
@Controller
public class RegisterAction {
    @Autowired
    private RegisterService registerService;

    /**
     * 发送验证码
     * @param mobile
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/register/sendSMS/{mobile}",method = RequestMethod.GET)
    public String sendSMS(@PathVariable("mobile")String mobile, HttpServletRequest request ){
        //生成验证码
        String code = AuthCodeUtil.getCode("0123456789");
        //发送短信
        String result = SMSUtil.sendSMS(mobile,code);
        //把验证码放入session中
        request.getSession().setAttribute("code",code);
        System.out.println(mobile);
        System.out.println(result);
        return result;
    }

    /**
     * 验证用户名
     * @param username
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/register/selectUsername",method = RequestMethod.POST)
    public String selectUsername(String username){
        //获取查询结果
        boolean result = registerService.selectUsername(username);
        //json封装
        Map<String, Boolean> map = new HashMap<>();
        map.put("valid", result);
        ObjectMapper mapper = new ObjectMapper();
        String resultString = "";
        try {
            resultString = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return resultString;
    }

    /**
     * 验证手机号码
     * @param mobile
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/register/selectMobile",method = RequestMethod.POST)
    public String selectMobile(String mobile){
        //获取查询结果
        boolean result = registerService.selectMobile(mobile);
        //json封装
        Map<String, Boolean> map = new HashMap<>();
        map.put("valid", result);
        ObjectMapper mapper = new ObjectMapper();
        String resultString = "";
        try {
            resultString = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    @ResponseBody
    @RequestMapping(value = "/register/selectCode",method = RequestMethod.POST)
    public String selectCode(String code,HttpServletRequest request){
        boolean result = false;
       //从session中获取验证码
        String code1 = (String) request.getSession().getAttribute("code");
        if (code.equals(code1)){
            result = true;
        }
        //从session中删除code
        request.getSession().removeAttribute("code");
        //json封装
        Map<String, Boolean> map = new HashMap<>();
        map.put("valid", result);
        ObjectMapper mapper = new ObjectMapper();
        String resultString = "";
        try {
            resultString = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return resultString;
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ModelAndView register(User user){
        ModelAndView mav = new ModelAndView();
        int i = registerService.register(user);
        if (i>0){
            //注册成功
            mav.setViewName("success");
        }
        return mav;
    }
}
