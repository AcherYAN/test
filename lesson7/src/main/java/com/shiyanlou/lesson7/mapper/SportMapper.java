package com.shiyanlou.lesson7.mapper;

import java.util.List;

import com.shiyanlou.lesson7.domain.Sport;

public interface SportMapper {

  	/**
	 * 创建运动
	 * @param sport
	 * @return
	 */
	int insert(Sport sport);

  	/**
	 * 查询运动
	 * @param id
	 * @return
	 */
	Sport getById(int id);

  	/**
	 * 查询所有运动
	 * @param
	 * @return
	 */
	List<Sport> getAll();

  	/**
	 * 更新运动
	 * @param sport
	 * @return
	 */
	int update(Sport sport);

  	/**
	 * 删除运动
	 * @param id
	 * @return
	 */
	int delete(int id);
}