package com.shiyanlou.lesson5.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyanlou.lesson5.domain.Job;
import com.shiyanlou.lesson5.mapper.JobMapper;
import com.shiyanlou.lesson5.service.JobService;

// 标识service
@Service
public class JobServiceImpl implements JobService{

    // 自动注入mapper
    @Autowired
    private JobMapper jobMapper;

      /**
     * 创建job
     * @param job
     * @return
     */
    public int insertJob(Job job) {
        int modifyId = jobMapper.insert(job);
        return modifyId;
    }

    /**
     * 删除job
     * @param id
     * @return
     */
    public int deleteJob(int id) {
        int modifyId = jobMapper.delete(id);
        return modifyId;
    }

    /**
     * 更新job
     * @param job
     * @return
     */
    public int updateJob(Job job) {
        int modifyId = jobMapper.update(job);
        return modifyId;
    }

    /**
     * 通过id查询job
     * @param id
     * @return
     */
    public Job selectJobById(int id) {
        Job job = jobMapper.selectById(id);
        return job;
    }

    /**
     * 查询所有job
     * @param
     * @return
     */
    public List<Job> selectAllJob() {
        List<Job> jobs = jobMapper.selectAll();
        return jobs;
    }
}
