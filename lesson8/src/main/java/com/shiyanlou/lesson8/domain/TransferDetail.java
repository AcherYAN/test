package com.shiyanlou.lesson8.domain;

import java.sql.Date;

public class TransferDetail {

  	// 主键id
	private int id;
  	// 用户id
	private int userId;
  	// 医生id
	private int doctorId;
	// 转账金额
	private int money;

  	// 构造函数
	public TransferDetail() {
		// TODO Auto-generated constructor stub
	}
  	// 构造函数
	public TransferDetail(int userId, int doctorId, int money) {
		super();
		this.userId = userId;
		this.doctorId = doctorId;
		this.money = money;
	}

  	// 属性setter、getter
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

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

   	// 重写toString方法
	@Override
	public String toString() {
		return "TransferDetail [id=" + id + ", userId=" + userId + ", doctorId="
				+ doctorId + ", money=" + money + "]";
	}
}