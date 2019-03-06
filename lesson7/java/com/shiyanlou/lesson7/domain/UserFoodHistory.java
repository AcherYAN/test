package com.shiyanlou.lesson7.domain;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
public class UserFoodHistory {
  	// 主键自增id
	private int id;
  	// 用户id
	private int userId;
  	// 食物详情
	private Food food;
  	// 该食物摄入量，单位g
	private int foodQuantity;
  	// 摄入饮食日期
	private Date collectDate;

	public UserFoodHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserFoodHistory(int userId, Food food, int foodQuantity, Date collectDate) {
		super();
		this.userId = userId;
		this.food = food;
		this.foodQuantity = foodQuantity;
		this.collectDate = collectDate;
	}

    // 属性setter、getter方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getFoodQuantity() {
		return foodQuantity;
	}

	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}

	public Date getCollectDate() {
		return collectDate;
	}

	public void setCollectDate(Date collectDate) {
		this.collectDate = collectDate;
	}

  	// 重写toString
	@Override
	public String toString() {
		return "UserFoodHistory [id=" + id + ", userId=" + userId + ", food=" + food + ", foodQuantity=" + foodQuantity + ", collectDate=" + collectDate + "]";
	}
}