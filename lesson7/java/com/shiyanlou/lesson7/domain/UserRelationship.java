package com.shiyanlou.lesson7.domain;

import java.util.List;
import java.util.Map;

public class UserRelationship {

  	// 用户id
	private int userId;
  	// 用户每日饮食摄入能量
	private List<EnergyDate> foodEnergies;
  	// 用户每日运动消耗能量
	private List<EnergyDate> sportEnergies;
  	// 用户每日各项生理指标的情况
	private Map<Integer, List<UserIndex>> userIndexs;

	public UserRelationship() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRelationship(int userId, List<EnergyDate> foodEnergies, List<EnergyDate> sportEnergies,
			Map<Integer, List<UserIndex>> userIndexs) {
		super();
		this.userId = userId;
		this.foodEnergies = foodEnergies;
		this.sportEnergies = sportEnergies;
		this.userIndexs = userIndexs;
	}

  	// 属性setter、getter方法
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<EnergyDate> getFoodEnergies() {
		return foodEnergies;
	}
	public void setFoodEnergies(List<EnergyDate> foodEnergies) {
		this.foodEnergies = foodEnergies;
	}
	public List<EnergyDate> getSportEnergies() {
		return sportEnergies;
	}
	public void setSportEnergies(List<EnergyDate> sportEnergies) {
		this.sportEnergies = sportEnergies;
	}
	public Map<Integer, List<UserIndex>> getUserIndexs() {
		return userIndexs;
	}
	public void setUserIndexs(Map<Integer, List<UserIndex>> userIndexs) {
		this.userIndexs = userIndexs;
	}

  	// 重写toString方法
	@Override
	public String toString() {
		return "UserRelationship [userId=" + userId + ", foodEnergies=" + foodEnergies + ", sportEnergies=" + sportEnergies + ", userIndexs=" + userIndexs + "]";
	}
}