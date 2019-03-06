package com.shiyanlou.lesson6.mapper;

import java.util.List;

import com.shiyanlou.lesson6.domain.User;

public interface UserMapper {

  	/**
	 * 通过id获取用户
	 * @param id
	 * @return
	 */
	User getById(int id);

  	/**
	 * 获取所有用户
	 * @return
	 */
	List<User> getAll();

 	 /**
	 * 创建用户
	 * @param user
	 * @return
	 */
	int insert(User user);

 	 /**
	 * 通过id更新用户
	 * @param user
	 * @return
	 */
	int update(User user);

 	 /**
	 * 删除用户
	 * @param id
	 * @return
	 */
	int delete(int id);

}