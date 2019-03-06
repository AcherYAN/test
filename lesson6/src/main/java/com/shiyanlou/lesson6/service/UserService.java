package com.shiyanlou.lesson6.service;

import com.shiyanlou.lesson6.domain.PaginationObject;
import com.shiyanlou.lesson6.domain.User;

public interface UserService {

  	/**
	 * 创建用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);

  	/**
	 * 通过id查询用户
	 * @param id
	 * @return
	 */
	public User getUserById(int id);

  	/**
	 * 分页查询用户
	 * @param pageNum 第几页，pageSize 每页几个
	 * @return
	 */
	public PaginationObject getAllUser(int pageNum, int pageSize);

  	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int updateUser(User user);

  	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	public int deleteUser(int id);
}