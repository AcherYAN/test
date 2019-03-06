package com.shiyanlou.lesson7.mapper;

import java.util.List;

import com.shiyanlou.lesson7.domain.EnergyDate;
import com.shiyanlou.lesson7.domain.UserFoodHistory;

public interface UserFoodHistoryMapper {
	// 记录用户饮食
	public int insert(UserFoodHistory userFoodHistory);
	// 获取指定用户所用饮食记录
	public List<UserFoodHistory> getAll(int userId);
	// 获取指定用户每日的摄入能量
	public List<EnergyDate> getSumFoodEnergy(int userId);
}