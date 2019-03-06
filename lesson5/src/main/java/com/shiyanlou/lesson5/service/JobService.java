package com.shiyanlou.lesson5.service;

import java.util.List;
import com.shiyanlou.lesson5.domain.Job;

public interface JobService {

      /**
     * 创建job
     * @param id
     * @return
     */
    public int insertJob(Job job);

      /**
     * 删除job
     * @param id
     * @return
     */
    public int deleteJob(int id);

      /**
     * 更新job
     * @param job
     * @return
     */
    public int updateJob(Job job);

      /**
     * 通过id查找job
     * @param id
     * @return
     */
    public Job selectJobById(int id);

      /**
     * 查找所有job
     * @param
     * @return
     */
    public List<Job> selectAllJob();
}