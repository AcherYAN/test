package com.shiyanlou.lesson7.mapper;

import java.util.List;

import com.shiyanlou.lesson7.domain.Food;

public interface FoodMapper {

  	/**
	 * 创建食物
	 * @param food
	 * @return
	 */
	int insert(Food food);

   	/**
	 * 查询食物
	 * @param id
	 * @return
	 */
	Food getById(int id);

   	/**
	 * 查询所有食物
	 * @param
	 * @return
	 */
	List<Food> getAll();

   	/**
	 * 更新食物
	 * @param food
	 * @return
	 */
	int update(Food food);

   	/**
	 * 删除食物
	 * @param id
	 * @return
	 */
	int delete(int id);
}