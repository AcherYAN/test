package com.shiyanlou.lesson8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiyanlou.lesson8.domain.ResultObject;
import com.shiyanlou.lesson8.domain.TransferDetail;
import com.shiyanlou.lesson8.service.AccountService;

// 标记controller，返回json数据
@RestController
public class AccountController {


    // 自动注入service
	@Autowired
	private AccountService accountService;

  	/**
	 * 转账
	 * @param transferDetail
	 * @return
	 */
	@PostMapping("transfer")
	public ResultObject add(@RequestBody TransferDetail transferDetail) {
		String status = accountService.transfer(transferDetail);
		ResultObject resultObject = new ResultObject(200, status, null);
		return resultObject;
	}
}