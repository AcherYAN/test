package com.shiyanlou.lesson7.service;

import com.shiyanlou.lesson7.domain.UserRelationship;

public interface UserRelationshipService {

  	/**
	 * 查询用户饮食、运动、生理指标关系
	 * @param userId
	 * @return
	 */
	public UserRelationship getRelationship(int userId);
}