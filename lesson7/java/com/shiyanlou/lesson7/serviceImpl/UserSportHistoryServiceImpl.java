package com.shiyanlou.lesson7.serviceImpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyanlou.lesson7.domain.UserEverydaySportSituation;
import com.shiyanlou.lesson7.domain.UserSportHistory;
import com.shiyanlou.lesson7.mapper.UserSportHistoryMapper;
import com.shiyanlou.lesson7.service.UserSportHistoryService;

// 标识service
@Service
public class UserSportHistoryServiceImpl implements UserSportHistoryService{

   	// 自动注入mapper
	@Autowired
	private UserSportHistoryMapper userSportHistoryMapper;

  	/**
	 * 创建用户运动记录
	 * @param userFoodHistory
	 * @return
	 */
	public int insertUserSportHistory(UserSportHistory userSportHistory) {
		int modifyId = userSportHistoryMapper.insert(userSportHistory);
		return modifyId;
	}

  	/**
	 * 查询用户运动记录
	 * @param userId
	 * @return
	 */
	public List<UserEverydaySportSituation> getAllUserSportHistory(int userId) {
		List<UserSportHistory> userSportHistories = userSportHistoryMapper.getAll(userId);

        // userSportMap，key为日期，value为用户该日运动情况
		Map<Date, List<UserSportHistory>> userSportMap = new HashMap<>();

		for(UserSportHistory userSportHistory: userSportHistories) {
			Date cDate = userSportHistory.getCollectDate();

          	// 如果当前日期已经存在于userSportMap中，将这条运动记录直接添加到list末尾
			if (userSportMap.containsKey(cDate)) {
				List<UserSportHistory> userSportList = userSportMap.get(cDate);
				userSportList.add(userSportHistory);

             // 如果userSportMap中不存在当前日期，则新建list，并将这条运动记录直接添加到list中
			} else {
				List<UserSportHistory> userSportList = new ArrayList<>();
				userSportList.add(userSportHistory);
				userSportMap.put(cDate, userSportList);
			}
		}

        // userEverydaySportSituations，一个元素代表用户一天的运动情况和消耗能量情况
		List<UserEverydaySportSituation> userEverydaySportSituations = new ArrayList<>();

		for(Entry<Date, List<UserSportHistory>> entry: userSportMap.entrySet()) {
			UserEverydaySportSituation userEverydaySportSituation = new UserEverydaySportSituation();
			userEverydaySportSituation.setUserId(userId);
			userEverydaySportSituation.setCollectDate(entry.getKey());
			userEverydaySportSituation.setUserSportHistories(entry.getValue());

          	// 消耗能量总和
			int sumConsumeEnergy = 0;
			for(UserSportHistory userSportHistory: entry.getValue()) {
				sumConsumeEnergy += userSportHistory.getSportTime() * userSportHistory.getSport().getConsumeEnergy();
			}

			userEverydaySportSituation.setSumConsumeEnergy(sumConsumeEnergy);
			userEverydaySportSituations.add(userEverydaySportSituation);
		}

		return userEverydaySportSituations;
	}
}