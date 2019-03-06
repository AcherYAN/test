package com.shiyanlou.lesson8.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shiyanlou.lesson8.domain.ResultObject;
import com.shiyanlou.lesson8.domain.User;
import com.shiyanlou.lesson8.service.UserService;

// 标记controller，返回json数据，URL前缀：/user
@RestController
@RequestMapping("user")
public class UserController {

    // 自动注入service
	@Autowired
	private UserService userService;

 	 /**
	 * 创建用户
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
	 * 删除用户
	 * @param id
	 * @return
	 */
	@DeleteMapping("delete")
	public ResultObject delete(@RequestParam int id) {
		int modifyId = userService.deleteUser(id);
		Map<String, Integer> map = new HashMap<>();
		map.put("modifyId", modifyId);
		ResultObject resultObject = new ResultObject(200, "success", map);
		return resultObject;
	}

  	/**
	 * 更新用户
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
	 * 查询用户
	 * @param id
	 * @return
	 */
	@GetMapping("find")
	public ResultObject find(@RequestParam int id) {
		User user = userService.selectUser(id);
		Map<String, User> map = new HashMap<>();
		map.put("user", user);
		ResultObject resultObject = new ResultObject(200, "success", map);
		return resultObject;
	}

}