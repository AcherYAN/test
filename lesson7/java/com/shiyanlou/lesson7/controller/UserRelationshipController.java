package com.shiyanlou.lesson7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shiyanlou.lesson7.domain.ResultObject;
import com.shiyanlou.lesson7.domain.UserRelationship;
import com.shiyanlou.lesson7.service.UserRelationshipService;

// 标识controller，返回json数据，URL前缀/api/v1/relationship
@RestController
@RequestMapping("api/v1/relationship")
public class UserRelationshipController {

 	// 自动注入service
	@Autowired
	private UserRelationshipService relationshipService;

    /**
	 * 查询用户饮食、运动、生理指标关系
	 * @param userId
	 * @return
	 */
	@RequestMapping("get")
	public ResultObject getRelationship(@RequestParam int userId) {
		UserRelationship relationship = relationshipService.getRelationship(userId);
		ResultObject resultObject = new ResultObject(0, "success", relationship);
		return resultObject;
	}
}