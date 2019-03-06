package com.shiyanlou.lesson7.service;

import com.shiyanlou.lesson7.domain.PaginationObject;
import com.shiyanlou.lesson7.domain.Sport;

public interface SportService {

  	/**
	 * 查询运动
	 * @param id
	 * @return
	 */
	public Sport getSportById(int id);

    /**
	 * 创建运动
	 * @param sport
	 * @return
	 */
	public int insertSport(Sport sport);

  	/**
	 * 分页查询运动
	 * @param pageNum 第几页, pageSize 每页多少个
	 * @return
	 */
	public PaginationObject getAllSport(int pageNum, int pageSize);

    /**
	 * 更新运动
	 * @param sport
	 * @return
	 */
	public int updateSport(Sport sport);

    /**
	 * 删除运动
	 * @param id
	 * @return
	 */
	public int deleteSport(int id);
}