package com.shiyanlou.lesson5.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiyanlou.lesson5.domain.ResultObject;
import com.shiyanlou.lesson5.domain.User;
import com.shiyanlou.lesson5.service.UserService;

// 标识controller，返回消息为json格式，URL前缀/user
@RestController
@RequestMapping("user")
public class UserController {

    // 自动注入service
    @Autowired
    private UserService userService;

      /**
     * 创建user
     * @param user
     * @return
     */
    @PostMapping("add")
    public ResultObject add(@RequestBody User user) {
        int modifyId = userService.insertUser(user);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

      /**
     * 删除user
     * @param id
     * @return
     */
    @DeleteMapping("delete/{id}")
    public ResultObject delete(@PathVariable int id) {
        int modifyId = userService.deleteUser(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    /**
     * 更新user
     * @param user
     * @return
     */
    @PutMapping("modify")
    public ResultObject modify(@RequestBody User user) {
        int modifyId = userService.updateUser(user);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    /**
     * 查询user
     * @param id
     * @return
     */
    @GetMapping("find/{id}")
    public ResultObject find(@PathVariable int id) {
        User user = userService.selectUserById(id);
        Map<String, User> map = new HashMap<>();
        map.put("user", user);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    /**
     * 查询user
     * @param
     * @return
     */
    @GetMapping("findAll")
    public ResultObject findAll() {
        List<User> users = userService.selectAllUser();
        Map<String, List<User>> map = new HashMap<>();
        map.put("user", users);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }
}