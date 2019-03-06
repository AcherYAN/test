package com.shiyanlou.lesson6.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shiyanlou.lesson6.domain.PaginationObject;
import com.shiyanlou.lesson6.domain.User;
import com.shiyanlou.lesson6.mapper.UserMapper;
import com.shiyanlou.lesson6.service.UserService;

// 标记service
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
      	// 设置创建时间
		user.setCreateTime(new java.sql.Date(new Date().getTime()));
		int modifyId = userMapper.insert(user);
		return modifyId;
	}

  	/**
	 * 根据id查询用户
	 * @param user
	 * @return
	 */
	public User getUserById(int id){
		User user = userMapper.getById(id);
		return user;
	}

  	/**
	 * 分页查询用户
	 * @param pageNum, pageSize
	 * @return
	 */
	public PaginationObject getAllUser(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<User> users = userMapper.getAll();
		PageInfo<User> appsPageInfo = new PageInfo<User>(users);
		long total = appsPageInfo.getTotal();
		PaginationObject paginationObject = new PaginationObject(users, pageNum, pageSize, total);
		return paginationObject;
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
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int deleteUser(int id) {
		int modifyId = userMapper.delete(id);
		return modifyId;
	}
}