package com.shiyanlou.lesson8.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyanlou.lesson8.dao.DoctorMapper;
import com.shiyanlou.lesson8.domain.Doctor;
import com.shiyanlou.lesson8.service.DoctorService;


@Service
public class DoctorServiceImpl implements DoctorService{

  	// 自动注入mapper
	@Autowired
	private DoctorMapper doctorMapper;

     /**
	 * 创建健康管理员
	 * @param doctor
	 * @return
	 */
	public int insertDoctor(Doctor doctor) {
		int modifyId = doctorMapper.insert(doctor);
		return modifyId;
	}

   /**
	 * 删除健康管理员
	 * @param id
	 * @return
	 */
	public int deleteDoctor(int id) {
		int modifyId = doctorMapper.delete(id);
		return modifyId;
	}

   /**
	 * 更新健康管理员
	 * @param doctor
	 * @return
	 */
	public int updateDoctor(Doctor doctor) {
		int modifyId = doctorMapper.update(doctor);
		return modifyId;
	}

   /**
	 * 查询健康管理员
	 * @param id
	 * @return
	 */
	public Doctor selectDoctor(int id) {
		Doctor doctor = doctorMapper.select(id);
		return doctor;
	}
}