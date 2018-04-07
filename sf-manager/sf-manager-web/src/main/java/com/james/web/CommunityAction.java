package com.james.web;

import com.james.dto.MessageResult;
import com.james.dto.Order;
import com.james.dto.Page;
import com.james.dto.Result;
import com.james.pojo.po.Community;
import com.james.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: 57140
 * Date: 2018/4/5
 * Time: 15:36
 * Version:V1.0
 */
@Controller
public class CommunityAction {
    @Autowired
    private CommunityService communityService;
    @ResponseBody
    @RequestMapping(value = "/community/communityAdd",method = RequestMethod.POST)
    public MessageResult addCommunity(Community community){
        MessageResult ms = new MessageResult();
        int i  = communityService.addCommunity(community);
        if (i>0){
            ms.setMessage("小区添加成功");
            ms.setSuccess(true);
        }
        return  ms;
    }
    @ResponseBody
    @RequestMapping(value = "/community/listCommunity",method = RequestMethod.GET)
    public Result<Community> listCommunity(Page page, Order order){
        return communityService.listCommunity(page,order);
    }
}
