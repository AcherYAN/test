package com.shiyanlou.lesson7.mapper;

import java.util.List;

import com.shiyanlou.lesson7.domain.EnergyDate;
import com.shiyanlou.lesson7.domain.UserSportHistory;

public interface UserSportHistoryMapper {
	// 记录用户运动
	public int insert(UserSportHistory userSportHistory);
	// 获取指定用户所有运动记录
	public List<UserSportHistory> getAll(int userId);
	//  获取指定用户每日的运动消耗能量
	public List<EnergyDate> getSumConsumeEnergy(int userId);
}