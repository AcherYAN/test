package com.shiyanlou.lesson6.controller;


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

import com.shiyanlou.lesson6.domain.PaginationObject;
import com.shiyanlou.lesson6.domain.ResultObject;
import com.shiyanlou.lesson6.domain.User;
import com.shiyanlou.lesson6.service.UserService;

// 标记controller
@RestController
@RequestMapping("api/v1/user")
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
	public ResultObject insertUser(@RequestBody User user) {
		int modifyId = userService.insertUser(user);
		Map<String, Integer> map = new HashMap<>();
		map.put("modifyId", modifyId);
		ResultObject resultObject = new ResultObject(200, "", map);
		return resultObject;
	}

  	/**
	 * 查询用户
	 * @param id
	 * @return
	 */
	@GetMapping("get")
	public ResultObject getUserById(@RequestParam int id) {
		User user = userService.getUserById(id);
		ResultObject resultObject = new ResultObject(0, "", user);
		return resultObject;
	}

  	/**
	 * 分页查询用户
	 * @param pageNum, pageSize
	 * @return
	 */
	@GetMapping("list")
	public ResultObject getAllUser(@RequestParam int pageNum, @RequestParam int pageSize) {
		PaginationObject paginationObj = userService.getAllUser(pageNum, pageSize);
		ResultObject resultObject = new ResultObject(0, "", paginationObj);
		return resultObject;
	}

  	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	@DeleteMapping("delete")
	public ResultObject deleteUser(@RequestParam int id) {
		int modifyId = userService.deleteUser(id);
		Map<String, Integer> map = new HashMap<>();
		map.put("modifyId", modifyId);
		ResultObject resultObject = new ResultObject(200, "", map);
		return resultObject;
	}

  	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	@PutMapping("edit")
	public ResultObject updateUser(@RequestBody User user) {
		int modifyId = userService.updateUser(user);
		Map<String, Integer> map = new HashMap<>();
		map.put("modifyId", modifyId);
		ResultObject resultObject = new ResultObject(200, "", map);
		return resultObject;
	}
}