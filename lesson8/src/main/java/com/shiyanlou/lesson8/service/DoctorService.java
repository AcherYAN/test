package com.shiyanlou.lesson8.service;

import com.shiyanlou.lesson8.domain.Doctor;

public interface DoctorService {

  	 /**
	 * 创建健康管理员
	 * @param doctor
	 * @return
	 */
	public int insertDoctor(Doctor doctor);

  	 /**
	 * 删除健康管理员
	 * @param id
	 * @return
	 */
	public int deleteDoctor(int id);

  	 /**
	 * 更新健康管理员
	 * @param doctor
	 * @return
	 */
	public int updateDoctor(Doctor doctor);

  	 /**
	 * 查询健康管理员
	 * @param id
	 * @return
	 */
	public Doctor selectDoctor(int id);
}