package com.shiyanlou.lesson7.serviceImpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyanlou.lesson7.domain.UserEverydayFoodSituation;
import com.shiyanlou.lesson7.domain.UserFoodHistory;
import com.shiyanlou.lesson7.mapper.UserFoodHistoryMapper;
import com.shiyanlou.lesson7.service.UserFoodHistoryService;

// 标识service
@Service
public class UserFoodHistoryServiceImpl implements UserFoodHistoryService{

  	// 自动注入mapper
	@Autowired
	private UserFoodHistoryMapper userFoodHistoryMapper;

  	/**
	 * 创建用户饮食记录
	 * @param userFoodHistory
	 * @return
	 */
	public int insertUserFoodHistory(UserFoodHistory userFoodHistory) {
		int modifyId = userFoodHistoryMapper.insert(userFoodHistory);
		return modifyId;
	}

    /**
	 * 查询用户所有饮食记录
	 * @param userId
	 * @return
	 */
	public List<UserEverydayFoodSituation> getAllUserFoodHistory(int userId) {
      	// 获取用户所有饮食记录
		List<UserFoodHistory> userFoodHistories = userFoodHistoryMapper.getAll(userId);

        // userFoodMap，key为日期，value为用户该日所有饮食记录
		Map<Date, List<UserFoodHistory>> userFoodMap = new HashMap<>();

      	for(UserFoodHistory userFoodHistory: userFoodHistories) {
			Date cDate = userFoodHistory.getCollectDate();
          	// 如果当前日期已经存在于userFoodMap中，将这条饮食记录直接添加到list末尾
			if (userFoodMap.containsKey(cDate)) {
				List<UserFoodHistory> userFoodList = userFoodMap.get(cDate);
				userFoodList.add(userFoodHistory);
              // 如果userFoodMap中不存在当前日期，则新建list，并将这条饮食记录直接添加到list中
			} else {
				List<UserFoodHistory> userFoodList = new ArrayList<>();
				userFoodList.add(userFoodHistory);
				userFoodMap.put(cDate, userFoodList);
			}
		}

      	// userEverydayFoodSituations中，一个元素代表用户一天的饮食情况和摄入能量情况
		List<UserEverydayFoodSituation> userEverydayFoodSituations = new ArrayList<>();

		for(Entry<Date, List<UserFoodHistory>> entry: userFoodMap.entrySet()) {
			UserEverydayFoodSituation userEverydayFoodSituation = new UserEverydayFoodSituation();
			userEverydayFoodSituation.setUserId(userId);
			userEverydayFoodSituation.setCollectDate(entry.getKey());
			userEverydayFoodSituation.setUserFoodHistories(entry.getValue());

          	// 某日摄入能量总和
			int sumFoodEnergy = 0;

          	// 统计食物能量总和
			for(UserFoodHistory userFoodHistory: entry.getValue()) {
				sumFoodEnergy += userFoodHistory.getFoodQuantity() * userFoodHistory.getFood().getFoodEnergy() / 500;
			}

			userEverydayFoodSituation.setSumFoodEnergy(sumFoodEnergy);
			userEverydayFoodSituations.add(userEverydayFoodSituation);
		}

		return userEverydayFoodSituations;
	}
}