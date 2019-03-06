package com.shiyanlou.lesson8.domain;

public class Account {

  	// 主键id
	private int id;
  	// 用户id
	private int userId;
  	// 账户余额
	private int balance;

  	// 构造函数
	public Account() {
		// TODO Auto-generated constructor stub
	}

    // 构造函数
	public Account(int userId, int balance) {
		super();
		this.userId = userId;
		this.balance = balance;
	}

  	// 属性getter、setter方法
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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

  	// 重写toString方法
	@Override
	public String toString() {
		return "Account [id=" + id + ", userId=" + userId + ", balance=" + balance + "]";
	}
}