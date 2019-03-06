package com.shiyanlou.lesson9.service;

import com.shiyanlou.lesson9.domain.ResultObject;
import com.shiyanlou.lesson9.domain.User;

public interface UserService {

      /**
     * 登录
     * @param user
     * @return
     */
    public ResultObject login(User user);

      /**
     * 注销
     * @param token
     * @return
     */
    public ResultObject logout(String token);
}
