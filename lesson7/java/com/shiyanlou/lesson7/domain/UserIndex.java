package com.shiyanlou.lesson7.domain;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class UserIndex {

  	// 自增id在delete和update时会使用
	private int id;

  	// 用户id
	@JsonInclude(Include.NON_DEFAULT)
	private int userId;

  	// 生理指标类型，包括（体重、血压、血糖、血脂、心率等）
	@JsonInclude(Include.NON_DEFAULT)
	private int indexType;

  	// 生理指标值
	private int indexContent;

  	// 用户上传日期
	private Date collectDate;

	public UserIndex() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserIndex(int userId, int indexType, int indexContent, Date collectDate) {
		super();
		this.userId = userId;
		this.indexType = indexType;
		this.indexContent = indexContent;
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
	public int getIndexType() {
		return indexType;
	}
	public void setIndexType(int indexType) {
		this.indexType = indexType;
	}
	public int getIndexContent() {
		return indexContent;
	}
	public void setIndexContent(int indexContent) {
		this.indexContent = indexContent;
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
		return "UserIndex [id=" + id + ", userId=" + userId + ", indexType=" + indexType + ", indexContent=" + indexContent + ", collectDate=" + collectDate + "]";
	}
}