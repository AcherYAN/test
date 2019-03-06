package com.shiyanlou.lesson8.dao;

import org.apache.ibatis.annotations.Mapper;

import com.shiyanlou.lesson8.domain.Account;

@Mapper
public interface AccountMapper {

  	/**
	 * 查询账户
	 * @param userId
	 * @return
	 */
	int select(int userId);

  	/**
	 * 更新账户
	 * @param account
	 * @return
	 */
	int update(Account account);
}