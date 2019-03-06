package com.shiyanlou.lesson5.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyanlou.lesson5.domain.User;
import com.shiyanlou.lesson5.mapper.UserMapper;
import com.shiyanlou.lesson5.service.UserService;

// 标识service
@Service
public class UserServiceImpl implements UserService{

    // 自动注入mapper
    @Autowired
    private UserMapper userMapper;

      /**
     * 创建user
     * @param user
     * @return
     */
    public int insertUser(User user) {
        int modifyId = userMapper.insert(user);
        return modifyId;
    }

      /**
     * 删除user
     * @param id
     * @return
     */
    public int deleteUser(int id) {
        int modifyId = userMapper.delete(id);
        return modifyId;
    }

      /**
     * 更新user
     * @param user
     * @return
     */
    public int updateUser(User user) {
        int modifyId = userMapper.update(user);
        return modifyId;
    }

      /**
     * 通过id查询user
     * @param id
     * @return
     */
    public User selectUserById(int id) {
        User user = userMapper.selectById(id);
        return user;
    }

      /**
     * 查询所有user
     * @param
     * @return
     */
    public List<User> selectAllUser() {
        List<User> users = userMapper.selectAll();
        return users;
    }
}