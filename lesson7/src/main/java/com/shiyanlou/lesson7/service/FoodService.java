package com.shiyanlou.lesson7.service;

import com.shiyanlou.lesson7.domain.Food;
import com.shiyanlou.lesson7.domain.PaginationObject;

public interface FoodService {

  	/**
	 * 查询食物
	 * @param id
	 * @return
	 */
	public Food getFoodById(int id);

  	/**
	 * 创建食物
	 * @param food
	 * @return
	 */
	public int insertFood(Food food);

  	/**
	 * 分页查询所有食物
	 * @param pageNum 第几页, pageSize 每页多少个
	 * @return
	 */
	public PaginationObject getAllFood(int pageNum, int pageSize);

  	/**
	 * 更新食物
	 * @param food
	 * @return
	 */
	public int updateFood(Food food);

  	/**
	 * 删除食物
	 * @param id
	 * @return
	 */
	public int deleteFood(int id);
}