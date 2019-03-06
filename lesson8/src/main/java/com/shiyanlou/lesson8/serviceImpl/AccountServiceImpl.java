package com.shiyanlou.lesson8.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shiyanlou.lesson8.dao.AccountMapper;
import com.shiyanlou.lesson8.domain.Account;
import com.shiyanlou.lesson8.domain.TransferDetail;
import com.shiyanlou.lesson8.service.AccountService;

// 标识service
// 标记事务
@Service
@Transactional
public class AccountServiceImpl implements AccountService{

  	// 自动注入mapper
	@Autowired
	private AccountMapper accountMapper;

  	// 转账
	@Override
	public String transfer(TransferDetail transferDetail) {
		try {
          	// 获取转账金额
			int money = transferDetail.getMoney();
          	// 获取用户id
			int userId = transferDetail.getUserId();
          	// 获取健康管理员id
			int doctorId = transferDetail.getDoctorId();

          	// 获取用户余额
			int userBalance = accountMapper.select(userId);
          	// 获取健康管理员余额
			int doctorBalance = accountMapper.select(doctorId);

            // 更新用户、健康管理员账户余额
			if (userBalance >= money) {
				Account userAccount = new Account(userId, userBalance - money);
				accountMapper.update(userAccount);
              	// System.out.println(1/0);
				Account doctorAccount = new Account(doctorId, doctorBalance + money);
				accountMapper.update(doctorAccount);
			} else {
				return "balance error";
			}
			return "success";
		} catch (Exception e) {
			throw e;
		}

	}

}