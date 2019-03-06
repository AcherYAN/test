package com.shiyanlou.lesson7.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shiyanlou.lesson7.domain.ResultObject;
import com.shiyanlou.lesson7.domain.UserEverydaySportSituation;
import com.shiyanlou.lesson7.domain.UserSportHistory;
import com.shiyanlou.lesson7.service.UserSportHistoryService;

// 标识controller，返回json数据，URL前缀/api/v1/user_sport_history
@RestController
@RequestMapping("/api/v1/user_sport_history")
public class UserSportHistoryController {

 	// 自动注入service
	@Autowired
	private UserSportHistoryService userSportHistoryService;

    /**
	 * 新建用户饮食记录
	 * @param userSportHistory
	 * @return
	 */
	@PostMapping("add")
	public ResultObject insertUserSportHistory(@RequestBody UserSportHistory userSportHistory) {
		int modifyId = userSportHistoryService.insertUserSportHistory(userSportHistory);
		Map<String, Integer> map = new HashMap<>();
		map.put("modifyId", modifyId);
		ResultObject resultObject = new ResultObject();
		resultObject.setResult(map);

      	// 通过modifyid判断是否执行成功
		if (modifyId == 1) {
			resultObject.setCode(1);
			resultObject.setMsg("success");
		} else {
			resultObject.setCode(-1);
			resultObject.setMsg("fail");
		}

		return resultObject;
	}

   	/**
	 * 查询用户饮食历史
	 * @param userId
	 * @return
	 */
	@GetMapping("get")
	public ResultObject getAllUserSportHistory(@RequestParam int userId) {
		List<UserEverydaySportSituation> userEverydaySportSituations = userSportHistoryService.getAllUserSportHistory(userId);
		ResultObject resultObject = new ResultObject(200, "success", userEverydaySportSituations);

		return resultObject;
	}

}