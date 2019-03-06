package com.shiyanlou.lesson8.service;

import com.shiyanlou.lesson8.domain.User;

public interface UserService {

  	/**
	 * 创建用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);

  	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int deleteUser(int id);

  	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int updateUser(User user);

  	/**
	 * 查询用户
	 * @param id
	 * @return
	 */
	public User selectUser(int id);
}