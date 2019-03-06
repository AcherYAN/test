package com.shiyanlou.lesson8.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Doctor {

  	// 主键id
	private int id;
  	// 名称
	private String name;
  	// 性别
	private int gender;
  	// 学历
	private String education;
  	// 编号
	private String certificateId;

	// 一对多
	@JsonInclude(Include.NON_DEFAULT)
	private List<User> users;

  	// 构造函数
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

  	// 构造函数
	public Doctor(String name, int gender, String education, String certificateId, List<User> users) {
		super();
		this.name = name;
		this.gender = gender;
		this.education = education;
		this.certificateId = certificateId;
		this.users = users;
	}

  	// 属性setter、getter方法
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

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

  	// 重写toString方法
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", gender=" + gender + ", education=" + education
				+ ", certificateId=" + certificateId + ", users=" + users + "]";
	}
}