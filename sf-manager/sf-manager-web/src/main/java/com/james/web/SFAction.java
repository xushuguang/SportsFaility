package com.james.web;

import com.james.dto.*;
import com.james.pojo.po.SportsFacility;
import com.james.service.SFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * User: 57140
 * Date: 2018/3/21
 * Time: 14:02
 * Version:V1.0
 */
@Controller
public class SFAction {
    @Autowired
    private SFService sfService;

    /**
     * 添加体育设施
     * @param sportsFacility
     * @return MessageResult
     */
    @ResponseBody
    @RequestMapping(value = "/sf/sfAdd",method = RequestMethod.POST)
    public MessageResult addSF(SportsFacility sportsFacility){
        MessageResult ms = new MessageResult();
        int i  = sfService.addSF(sportsFacility);
        if (i>0){
            ms.setMessage("设施添加成功");
            ms.setSuccess(true);
        }
        return  ms;
    }
    /**
     * 列表查询体育设备
     * @param page
     * @param order
     * @return result
     */
    @ResponseBody
    @RequestMapping(value = "/sf/listSF",method = RequestMethod.GET)
    public Result<SportsFacility> listSF(Page page, Order order){
        return sfService.listSF(page,order);
    }
    @ResponseBody
    @RequestMapping(value = "/sf/details",method = RequestMethod.GET)
    public Result<Propertygrid> detailsSF(SportsFacility sportsFacility){
        Result<Propertygrid> result = new Result<>();
        List<Propertygrid> list = new ArrayList<>();
        Propertygrid propertygrid1 = new Propertygrid();
        propertygrid1.setName("类别");
        propertygrid1.setValue(sportsFacility.getCategory());
        propertygrid1.setEditor("text");
        Propertygrid propertygrid2 = new Propertygrid();
        propertygrid2.setName("名称");
        propertygrid2.setValue(sportsFacility.getName());
        propertygrid2.setEditor("text");
        Propertygrid propertygrid3 = new Propertygrid();
        propertygrid3.setName("是否损坏");
        propertygrid3.setValue(sportsFacility.getDamage());
        propertygrid3.setEditor("text");
        list.add(propertygrid1);
        list.add(propertygrid2);
        list.add(propertygrid3);
        result.setRows(list);
        return result;
    }
}
