package com.shiyanlou.lesson5.mapper;

import java.util.List;
import com.shiyanlou.lesson5.domain.Job;

public interface JobMapper {

      /**
     * 通过id查找job
     * @param id
     * @return
     */
    Job selectById(int id);

      /**
     * 通过id查找job简要信息
     * @param id
     * @return
     */
    Job selectBriefById(int id);

      /**
     * 查找所有job
     * @return
     */
    List<Job> selectAll();

      /**
     * 创建job
     * @param job
     * @return
     */
    int insert(Job job);

      /**
     * 通过id更新job
     * @param job
     * @return
     */
    int update(Job job);

      /**
     * 通过id删除job
     * @param id
     * @return
     */
    int delete(int id);
}