package com.shiyanlou.lesson8.dao;

import org.apache.ibatis.annotations.Mapper;

import com.shiyanlou.lesson8.domain.User;

@Mapper
public interface UserMapper {

  	 /**
	 * 查询用户
	 * @param id
	 * @return
	 */
	User select(int id);

  	 /**
	 * 新建用户
	 * @param user
	 * @return
	 */
	int insert(User user);

  	 /**
	 * 更新用户
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