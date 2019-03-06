package com.shiyanlou.lesson6.mapper;

import java.util.List;

import com.shiyanlou.lesson6.domain.UserIndex;

public interface UserIndexMapper {

	 /**
	 * 通过用户id和指标类型获取用户的所有指标
	 * @param userIndex
	 * @return
	 */
	List<UserIndex> getById(UserIndex userIndex);

  	/**
	 * 创建用户生理指标数据
	 * @param userIndex
	 * @return
	 */
	int insert(UserIndex userIndex);

  	/**
	 * 更新用户生理指标数据
	 * @param userIndex
	 * @return
	 */
	int update(UserIndex userIndex);

  	/**
	 * 删除用户生理指标数据
	 * @param userIndexId
	 * @return
	 */
	int delete(int userIndexId);

}