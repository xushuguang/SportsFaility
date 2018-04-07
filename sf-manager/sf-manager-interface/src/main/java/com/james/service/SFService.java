package com.james.service;

import com.james.pojo.po.SportsFacility;
import com.james.dto.Order;
import com.james.dto.Page;
import com.james.dto.Result;

/**
 * User: 57140
 * Date: 2018/3/21
 * Time: 14:06
 * Version:V1.0
 */
public interface SFService {
    int addSF(SportsFacility sportsFacility);

    Result<SportsFacility> listSF(Page page, Order order);
}
