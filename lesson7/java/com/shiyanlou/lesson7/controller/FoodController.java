package com.shiyanlou.lesson7.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shiyanlou.lesson7.domain.Food;
import com.shiyanlou.lesson7.domain.PaginationObject;
import com.shiyanlou.lesson7.domain.ResultObject;
import com.shiyanlou.lesson7.service.FoodService;

// 标识controller，返回json数据，URL前缀/api/v1/food
@RestController
@RequestMapping("api/v1/food")
public class FoodController {

  	// 自动注入service
	@Autowired
	private FoodService foodService;

  	 /**
	 * 查询食物
	 * @param id
	 * @return
	 */
	@GetMapping("get")
	public ResultObject getFoodById(@RequestParam int id) {
		Food food = foodService.getFoodById(id);
		ResultObject resultObject = new ResultObject(200, "success", food);
		return resultObject;
	}

    /**
	 * 新建食物
	 * @param food
	 * @return
	 */
	@PostMapping("add")
	public ResultObject insertFood(@RequestBody Food food) {
		int modifyId = foodService.insertFood(food);
		Map<String, Integer> map = new HashMap<>();
		map.put("modifyId", modifyId);
		ResultObject resultObject = new ResultObject(200, "success", map);
		return resultObject;
	}

    /**
	 * 分页查询食物
	 * @param pageNum, pageSize
	 * @return
	 */
	@GetMapping("list")
	public ResultObject getAllFood(@RequestParam int pageNum, @RequestParam int pageSize) {
		PaginationObject paginationObj = foodService.getAllFood(pageNum, pageSize);
		ResultObject resultObject = new ResultObject(200, "success", paginationObj);

		return resultObject;
	}

    /**
	 * 删除食物
	 * @param id
	 * @return
	 */
	@DeleteMapping("delete")
	public ResultObject deleteFood(@RequestParam int id) {
		int modifyId = foodService.deleteFood(id);
		Map<String, Integer> map = new HashMap<>();
		map.put("modifyId", modifyId);
		ResultObject resultObject = new ResultObject(200, "success", map);
		return resultObject;
	}

    /**
	 * 更新食物
	 * @param food
	 * @return
	 */
	@PutMapping("edit")
	public ResultObject updateFood(@RequestBody Food food) {
		int modifyId = foodService.updateFood(food);
		Map<String, Integer> map = new HashMap<>();
		map.put("modifyId", modifyId);
		ResultObject resultObject = new ResultObject(200, "success", map);
		return resultObject;
	}
}