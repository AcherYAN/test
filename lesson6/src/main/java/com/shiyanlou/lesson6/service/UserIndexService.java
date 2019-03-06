package com.shiyanlou.lesson6.service;

import java.util.List;

import com.shiyanlou.lesson6.domain.UserIndex;

public interface UserIndexService {

  	/**
	 * 通过userID、类型查询用户生理指标数据
	 * @param userIndex
	 * @return
	 */
	public List<UserIndex> getUserIndexById(UserIndex userIndex);

  	/**
	 * 创建用户生理指标数据
	 * @param userIndex
	 * @return
	 */
	public int insertUserIndex(UserIndex userIndex);

  	/**
	 * 更新用户生理指标数据
	 * @param userIndex
	 * @return
	 */
	public int updateUserIndex(UserIndex userIndex);

  	/**
	 * 删除用户生理指标数据
	 * @param userIndexId
	 * @return
	 */
	public int deleteUserIndex(int userIndexId);
}