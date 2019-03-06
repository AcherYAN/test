package com.shiyanlou.lesson7.mapper;

import java.util.List;

import com.shiyanlou.lesson7.domain.UserIndex;

public interface UserIndexMapper {
	// 获取指定用户所有生理指标
	List<UserIndex> getById(int userId);
}