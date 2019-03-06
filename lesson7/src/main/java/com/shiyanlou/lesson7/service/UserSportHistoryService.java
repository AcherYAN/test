package com.shiyanlou.lesson7.service;

import java.util.List;

import com.shiyanlou.lesson7.domain.UserEverydaySportSituation;
import com.shiyanlou.lesson7.domain.UserSportHistory;

public interface UserSportHistoryService {

    /**
	 * 创建用户运动记录
	 * @param userSportHistory
	 * @return
	 */
	public int insertUserSportHistory(UserSportHistory userSportHistory);

    /**
	 * 查询用户所有运动记录
	 * @param userId
	 * @return
	 */
	public List<UserEverydaySportSituation> getAllUserSportHistory(int userId);
}