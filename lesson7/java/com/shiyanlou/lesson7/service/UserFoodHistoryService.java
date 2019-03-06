package com.shiyanlou.lesson7.service;

import java.util.List;

import com.shiyanlou.lesson7.domain.UserEverydayFoodSituation;
import com.shiyanlou.lesson7.domain.UserFoodHistory;


public interface UserFoodHistoryService {

    /**
	 * 创建用户饮食记录
	 * @param userFoodHistory
	 * @return
	 */
	public int insertUserFoodHistory(UserFoodHistory userFoodHistory);

      /**
	 * 查询用户所有饮食记录
	 * @param userId
	 * @return
	 */
	public List<UserEverydayFoodSituation> getAllUserFoodHistory(int userId);
}