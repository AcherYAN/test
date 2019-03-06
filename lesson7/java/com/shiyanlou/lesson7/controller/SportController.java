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

import com.shiyanlou.lesson7.domain.PaginationObject;
import com.shiyanlou.lesson7.domain.ResultObject;
import com.shiyanlou.lesson7.domain.Sport;
import com.shiyanlou.lesson7.service.SportService;

// 标识controller，返回json数据，URL前缀/api/v1/sport
@RestController
@RequestMapping("api/v1/sport")
public class SportController {

  	// 自动注入service
	@Autowired
	private SportService sportService;

    /**
	 * 查询运动
	 * @param id
	 * @return
	 */
	@GetMapping("get")
	public ResultObject getSportById(@RequestParam int id) {
		Sport sport = sportService.getSportById(id);
		ResultObject resultObject = new ResultObject(200, "success", sport);
		return resultObject;
	}

    /**
	 * 新建运动
	 * @param sport
	 * @return
	 */
	@PostMapping("add")
	public ResultObject insertSport(@RequestBody Sport sport) {
		int modifyId = sportService.insertSport(sport);
		Map<String, Integer> map = new HashMap<>();
		map.put("modifyId", modifyId);
		ResultObject resultObject = new ResultObject(200, "success", map);
		return resultObject;
	}

    /**
	 * 分页查询运动
	 * @param pageNum, pageSize
	 * @return
	 */
	@GetMapping("list")
	public ResultObject getAllSport(@RequestParam int pageNum, @RequestParam int pageSize) {
		PaginationObject paginationObject = sportService.getAllSport(pageNum, pageSize);
		ResultObject resultObject = new ResultObject(200, "success", paginationObject);
		return resultObject;
	}

    /**
	 * 删除运动
	 * @param id
	 * @return
	 */
	@DeleteMapping("delete")
	public ResultObject deleteSport(@RequestParam int id) {
		int modifyId = sportService.deleteSport(id);
		Map<String, Integer> map = new HashMap<>();
		map.put("modifyId", modifyId);
		ResultObject resultObject = new ResultObject(200, "success", map);
		return resultObject;
	}

    /**
	 * 更新运动
	 * @param sport
	 * @return
	 */
	@PutMapping("edit")
	public ResultObject updateSport(@RequestBody Sport sport) {
		int modifyId = sportService.updateSport(sport);
		Map<String, Integer> map = new HashMap<>();
		map.put("modifyId", modifyId);
		ResultObject resultObject = new ResultObject(200, "success", map);
		return resultObject;
	}
}