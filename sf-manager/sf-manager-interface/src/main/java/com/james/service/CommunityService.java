package com.james.service;

import com.james.dto.Order;
import com.james.dto.Page;
import com.james.dto.Result;
import com.james.pojo.po.Community;

/**
 * User: 57140
 * Date: 2018/4/5
 * Time: 15:39
 * Version:V1.0
 */
public interface CommunityService {
    int addCommunity(Community community);

    Result<Community> listCommunity(Page page, Order order);
}
