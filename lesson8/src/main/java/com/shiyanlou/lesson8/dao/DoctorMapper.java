package com.shiyanlou.lesson8.dao;

import org.apache.ibatis.annotations.Mapper;

import com.shiyanlou.lesson8.domain.Doctor;

@Mapper
public interface DoctorMapper {

  	 /**
	 * 查询健康管理员
	 * @param id
	 * @return
	 */
	Doctor select(int id);

	 /**
	 * 新建健康管理员
	 * @param doctor
	 * @return
	 */
	int insert(Doctor doctor);

  	 /**
	 * 更新健康管理员
	 * @param doctor
	 * @return
	 */
  	int update(Doctor doctor);

  	 /**
	 * 删除健康管理员
	 * @param id
	 * @return
	 */
	int delete(int id);
}