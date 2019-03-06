package com.shiyanlou.lesson5.service;

import java.util.List;
import com.shiyanlou.lesson5.domain.User;

public interface UserService {

      /**
     * 创建user
     * @param user
     * @return
     */
    public int insertUser(User user);

      /**
     * 删除user
     * @param id
     * @return
     */
    public int deleteUser(int id);

      /**
     * 更新user
     * @param user
     * @return
     */
    public int updateUser(User user);

      /**
     * 通过id查询user
     * @param id
     * @return
     */
    public User selectUserById(int id);

      /**
     * 查询所有user
     * @param
     * @return
     */
    public List<User> selectAllUser();
}