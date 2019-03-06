package com.shiyanlou.lesson5.mapper;

import java.util.List;
import com.shiyanlou.lesson5.domain.User;

public interface UserMapper {

      /**
     * 通过id查找user
     * @param id
     * @return
     */
    User selectById(int id);

    /**
     * 通过Jobid查找user
     * @param id
     * @return
     */
    User selectByJobId(int id);

    /**
     * 查找所有用户
     * @return
     */
    List<User> selectAll();

      /**
     * 创建user
     * @param user
     * @return
     */
    int insert(User user);

      /**
     * 通过id更新user
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 通过id删除user
     * @param id
     * @return
     */
    int delete(int id);
}