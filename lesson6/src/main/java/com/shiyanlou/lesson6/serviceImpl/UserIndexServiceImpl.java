package com.shiyanlou.lesson6.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyanlou.lesson6.domain.UserIndex;
import com.shiyanlou.lesson6.mapper.UserIndexMapper;
import com.shiyanlou.lesson6.service.UserIndexService;

// 标记service
@Service
public class UserIndexServiceImpl implements UserIndexService{

  	// 自动注入mapper
	@Autowired
	private UserIndexMapper userIndexMapper;

  	/**
	 * 通过userID、类型查询用户生理指标数据
	 * @param userIndex
	 * @return
	 */
	public List<UserIndex> getUserIndexById(UserIndex userIndex) {
		List<UserIndex> userIndexs = userIndexMapper.getById(userIndex);
		return userIndexs;
	}

  	/**
	 * 创建用户生理指标数据
	 * @param userIndex
	 * @return
	 */
	public int insertUserIndex(UserIndex userIndex) {
      	// 设置创建时间
		userIndex.setCollectDate(new java.sql.Date(new Date().getTime()));
		int modifyId = userIndexMapper.insert(userIndex);
		return modifyId;
	}

  	/**
	 * 更新用户生理指标数据
	 * @param userIndex
	 * @return
	 */
	public int updateUserIndex(UserIndex userIndex) {
		int modifyId = userIndexMapper.update(userIndex);
		return modifyId;
	}

  	/**
	 * 删除用户生理指标数据
	 * @param userIndexId
	 * @return
	 */
	public int deleteUserIndex(int userIndexId) {
		int modifyId = userIndexMapper.delete(userIndexId);
		return modifyId;
	}
}