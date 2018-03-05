package com.james.service;

import com.james.pojo.po.User; /**
 * User: 57140
 * Date: 2018/3/5
 * Time: 20:09
 * Version:V1.0
 */
public interface RegisterService {
    /**
     * 验证用户名是否存在
     * @param username
     * @return
     */
    boolean selectUsername(String username);

    /**
     * 验证手机号是否已被注册
     * @param mobile
     * @return
     */
    boolean selectMobile(String mobile);

    int register(User user);
}
