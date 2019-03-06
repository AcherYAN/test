package com.shiyanlou.lesson7.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
public class Sport {

  	// 主键自增id
	private int id;
  	// 运动名称
	private String name;
  	// 运动描述
	private String description;
	// 运动每小时所消耗能量
	private int consumeEnergy;

	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sport(String name, String description, int consumeEnergy) {
		super();
		this.name = name;
		this.description = description;
		this.consumeEnergy = consumeEnergy;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getConsumeEnergy() {
		return consumeEnergy;
	}

	public void setConsumeEnergy(int consumeEnergy) {
		this.consumeEnergy = consumeEnergy;
	}

  	// 重写toString方法
	@Override
	public String toString() {
		return "Sport [id=" + id + ", name=" + name + ", description=" + description + ", consumeEnergy=" + consumeEnergy + "]";
	}
}