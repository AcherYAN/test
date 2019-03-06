package com.shiyanlou.lesson7.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shiyanlou.lesson7.domain.Food;
import com.shiyanlou.lesson7.domain.PaginationObject;
import com.shiyanlou.lesson7.mapper.FoodMapper;
import com.shiyanlou.lesson7.service.FoodService;

// 标识service
@Service
public class FoodServiceImpl implements FoodService{

  	// 自动注入mapper
	@Autowired
	private FoodMapper foodMapper;

    /**
	 * 查询食物
	 * @param id
	 * @return
	 */
	public Food getFoodById(int id) {
		Food food = foodMapper.getById(id);
		return food;
	}

 	 /**
	 * 创建食物
	 * @param food
	 * @return
	 */
	public int insertFood(Food food) {
		int modifyId = foodMapper.insert(food);
		return modifyId;
	}

   /**
	 * 分页查询食物
	 * @param pageNum, pageSize
	 * @return
	 */
	public PaginationObject getAllFood(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Food> foods = foodMapper.getAll();
		PageInfo<Food> appsPageInfo = new PageInfo<>(foods);
		long total = appsPageInfo.getTotal();
		PaginationObject paginationObject = new PaginationObject(foods, pageNum, pageSize, total);
		return paginationObject;
	}

   /**
	 * 更新食物
	 * @param food
	 * @return
	 */
	public int updateFood(Food food) {
		int modifyId = foodMapper.update(food);
		return modifyId;
	}

   /**
	 * 删除食物
	 * @param id
	 * @return
	 */
	public int deleteFood(int id) {
		int modifyId = foodMapper.delete(id);
		return modifyId;
	}
}