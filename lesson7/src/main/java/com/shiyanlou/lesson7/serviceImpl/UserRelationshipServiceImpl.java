package com.shiyanlou.lesson7.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyanlou.lesson7.domain.EnergyDate;
import com.shiyanlou.lesson7.domain.UserIndex;
import com.shiyanlou.lesson7.domain.UserRelationship;
import com.shiyanlou.lesson7.mapper.UserFoodHistoryMapper;
import com.shiyanlou.lesson7.mapper.UserIndexMapper;
import com.shiyanlou.lesson7.mapper.UserSportHistoryMapper;

import com.shiyanlou.lesson7.service.UserRelationshipService;

// 标识service
@Service
public class UserRelationshipServiceImpl implements UserRelationshipService {

  	// 自动注入userFoodHistoryMapper
	@Autowired
	private UserFoodHistoryMapper userFoodHistoryMapper;

  	// 自动注入userSportHistoryMapper
	@Autowired
	private UserSportHistoryMapper userSportHistoryMapper;

  	// 自动注入userIndexMapper
	@Autowired
	private UserIndexMapper userIndexMapper;

	public UserRelationship getRelationship(int userId) {
		UserRelationship relationship = new UserRelationship();

        // foodEnergies，用户每天摄入能量和日期
		List<EnergyDate> foodEnergies = userFoodHistoryMapper.getSumFoodEnergy(userId);
       	// sportEnergyDates，用户每天运动消耗能量和日期
		List<EnergyDate> sportEnergyDates = userSportHistoryMapper.getSumConsumeEnergy(userId);
      	// userIndexs，用户所有生理指标
		List<UserIndex> userIndexs = userIndexMapper.getById(userId);
      	// map，key：生理指标类型，value：用户该项生理指标历史情况
		Map<Integer, List<UserIndex>> map = new HashMap<>();

      	// 根据生理指标类型分类
		for(UserIndex userIndex: userIndexs) {
			int indexType = userIndex.getIndexType();
			if (map.containsKey(indexType)) {
				List<UserIndex> userIndexs2 = map.get(indexType);
				userIndexs2.add(userIndex);
			} else {
				List<UserIndex> userIndexs2 = new ArrayList<>();
				userIndexs2.add(userIndex);
				map.put(indexType, userIndexs2);
			}
		}

		relationship.setUserId(userId);
		relationship.setFoodEnergies(foodEnergies);
		relationship.setSportEnergies(sportEnergyDates);
		relationship.setUserIndexs(map);
		return relationship;
	}
}