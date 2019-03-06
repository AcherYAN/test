package com.shiyanlou.lesson7.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
public class Food {

    // 主键自增id
	private int id;
  	// 食物名称
	private String name;
    // 食物描述
	private String description;
    // 食物每500g所含能量
	private int foodEnergy;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(String name, String description, int foodEnergy) {
		super();
		this.name = name;
		this.description = description;
		this.foodEnergy = foodEnergy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

  	// 属性setter、getter方法
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

	public int getFoodEnergy() {
		return foodEnergy;
	}

	public void setFoodEnergy(int foodEnergy) {
		this.foodEnergy = foodEnergy;
	}

  	// 重写toString方法
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", description=" + description + ", foodEnergy=" + foodEnergy + "]";
	}
}