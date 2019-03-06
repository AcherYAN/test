package com.shiyanlou.lesson7.domain;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
public class UserSportHistory {

    // 主键自增id
	private int id;
  	// 用户id
	private int userId;
  	// 运动详情
	private Sport sport;
  	// 运动时间，单位h
	private int sportTime;
  	// 运动日期
	private Date collectDate;

	public UserSportHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserSportHistory(int userId, Sport sport, int sportTime, Date collectDate) {
		super();
		this.userId = userId;
		this.sport = sport;
		this.sportTime = sportTime;
		this.collectDate = collectDate;
	}

  	// 属性的setter、getter方法
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

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public int getSportTime() {
		return sportTime;
	}

	public void setSportTime(int sportTime) {
		this.sportTime = sportTime;
	}

	public Date getCollectDate() {
		return collectDate;
	}

	public void setCollectDate(Date collectDate) {
		this.collectDate = collectDate;
	}

  	// 重写toString方法
	@Override
	public String toString() {
		return "UserSportHistory [id=" + id + ", userId=" + userId + ", sport=" + sport + ", sportTime=" + sportTime + ", collectDate=" + collectDate + "]";
	}
}