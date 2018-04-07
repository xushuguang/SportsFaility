package com.james.service;

import com.james.dto.Order;
import com.james.dto.Page;
import com.james.dto.Result;
import com.james.pojo.vo.UserVo;

/**
 * User: 57140
 * Date: 2018/4/7
 * Time: 17:08
 * Version:V1.0
 */
public interface UserService {
    Result<UserVo> listUserVo(Page page, Order order);
}
