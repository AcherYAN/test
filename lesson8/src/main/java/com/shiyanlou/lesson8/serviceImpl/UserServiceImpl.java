package com.shiyanlou.lesson8.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyanlou.lesson8.dao.UserMapper;
import com.shiyanlou.lesson8.domain.User;
import com.shiyanlou.lesson8.service.UserService;


@Service
public class UserServiceImpl implements UserService{

    // 自动注入mapper
	@Autowired
	private UserMapper userMapper;

    /**
	 * 创建用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user) {
		int modifyId = userMapper.insert(user);
		return modifyId;
	}

  	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int deleteUser(int id) {
		int modifyId = userMapper.delete(id);
		return modifyId;
	}

  	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int updateUser(User user) {
		int modifyId = userMapper.update(user);
		return modifyId;
	}

  	/**
	 * 查询用户
	 * @param id
	 * @return
	 */
	public User selectUser(int id) {
		User user = userMapper.select(id);
		return user;
	}
}