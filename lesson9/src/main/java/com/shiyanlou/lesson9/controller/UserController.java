package com.shiyanlou.lesson9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shiyanlou.lesson9.domain.ResultObject;
import com.shiyanlou.lesson9.domain.User;
import com.shiyanlou.lesson9.service.UserService;

// 标记controller，返回json数据，URL前缀：/user
@RestController
@RequestMapping("user")
public class UserController {

      // 自动注入service
    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param user
     * @return
     */
    @PostMapping("login")
    public ResultObject login(@RequestBody User user) {
        if (user == null) {
            return new ResultObject(-1, "param empty", null);
        }
        ResultObject resultObject = userService.login(user);
        return resultObject;
    }

       /**
     * 测试单点登录
     * @param
     * @return
     */
    @GetMapping("test")
    public ResultObject test() {
        ResultObject resultObject = new ResultObject(1, "test success", null);
        return resultObject;
    }

     /**
     * 注销
     * @param token
     * @return
     */
    @GetMapping("logout")
    public ResultObject logout(@RequestParam String token) {
        ResultObject resultObject = userService.logout(token);
        return resultObject;
    }

}
