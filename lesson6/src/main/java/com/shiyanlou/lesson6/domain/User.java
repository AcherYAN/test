package com.shiyanlou.lesson6.domain;

import java.sql.Date;

public class User{

  	// 用户id
	private int id;
	// 用户姓名
	private String name;
  	// 用户性别
	private int gender;
  	// 用户年龄
	private int age;
	// 用户手机号
	private String phone;
	// 创建时间
  	private Date createTime;
	// 用户工作
	private int job;
  	// 用户地址
	private String address;

  	// 构造函数
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

    // 构造函数
	public User(String name, int gender, int age, String phone, Date createTime, int job, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.createTime = createTime;
		this.job = job;
		this.address = address;
	}

  	// 属性的setter、getter方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getJob() {
		return job;
	}
	public void setJob(int job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

  	// 重写toString方法
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", phone=" + phone
				+ ", createTime=" + createTime + ", job=" + job + ", address=" + address + "]";
	}

}