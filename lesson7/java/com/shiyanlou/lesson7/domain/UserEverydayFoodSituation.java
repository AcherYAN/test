package com.shiyanlou.lesson7.domain;

import java.sql.Date;
import java.util.List;

public class UserEverydayFoodSituation {

  	// 用户id
	private int userId;
    // 饮食日期
	private Date collectDate;
  	// 该日摄入总能量
	private int sumFoodEnergy;
  	// 该日摄入食物详情
	private List<UserFoodHistory> userFoodHistories;

	public UserEverydayFoodSituation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserEverydayFoodSituation(int userId, Date collectDate, int sumFoodEnergy,
			List<UserFoodHistory> userFoodHistories) {
		super();
		this.userId = userId;
		this.collectDate = collectDate;
		this.sumFoodEnergy = sumFoodEnergy;
		this.userFoodHistories = userFoodHistories;
	}

    // 属性setter、getter方法
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getCollectDate() {
		return collectDate;
	}

	public void setCollectDate(Date collectDate) {
		this.collectDate = collectDate;
	}

	public int getSumFoodEnergy() {
		return sumFoodEnergy;
	}

	public void setSumFoodEnergy(int sumFoodEnergy) {
		this.sumFoodEnergy = sumFoodEnergy;
	}

	public List<UserFoodHistory> getUserFoodHistories() {
		return userFoodHistories;
	}

	public void setUserFoodHistories(List<UserFoodHistory> userFoodHistories) {
		this.userFoodHistories = userFoodHistories;
	}

  	// 重写toString方法
	@Override
	public String toString() {
		return "UserEverydayFoodSituation [userId=" + userId + ", collectDate=" + collectDate + ", sumFoodEnergy=" + sumFoodEnergy + ", userFoodHistories=" + userFoodHistories + "]";
	}
}