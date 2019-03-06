package com.shiyanlou.lesson8.service;

import com.shiyanlou.lesson8.domain.TransferDetail;

public interface AccountService {

  	 /**
	 * 转账
	 * @param transferDetail
	 * @return
	 */
	public String transfer(TransferDetail transferDetail);
}