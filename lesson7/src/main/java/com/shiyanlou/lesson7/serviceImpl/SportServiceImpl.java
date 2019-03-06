package com.shiyanlou.lesson7.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shiyanlou.lesson7.domain.PaginationObject;
import com.shiyanlou.lesson7.domain.Sport;
import com.shiyanlou.lesson7.mapper.SportMapper;
import com.shiyanlou.lesson7.service.SportService;

// 标识service
@Service
public class SportServiceImpl implements SportService{

    // 自动注入mapper
	@Autowired
	private SportMapper sportMapper;

    /**
	 * 查询运动
	 * @param id
	 * @return
	 */
	public Sport getSportById(int id) {
		Sport sport = sportMapper.getById(id);
		return sport;
	}

  	/**
	 * 创建运动
	 * @param sport
	 * @return
	 */
	public int insertSport(Sport sport) {
		int modifyId = sportMapper.insert(sport);
		return modifyId;
	}

    /**
	 * 分页查询运动
	 * @param pageNum, pageSize
	 * @return
	 */
	public PaginationObject getAllSport(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Sport> sports = sportMapper.getAll();
		PageInfo<Sport> appsPageInfo = new PageInfo<>(sports);
		long total = appsPageInfo.getTotal();
		PaginationObject paginationObject = new PaginationObject(sports, pageNum, pageSize, total);
		return paginationObject;	}

    /**
	 * 更新运动
	 * @param sport
	 * @return
	 */
	public int updateSport(Sport sport) {
		int modifyId = sportMapper.update(sport);
		return modifyId;
	}

    /**
	 * 删除运动
	 * @param id
	 * @return
	 */
	public int deleteSport(int id) {
		int modifyId = sportMapper.delete(id);
		return modifyId;
	}
}