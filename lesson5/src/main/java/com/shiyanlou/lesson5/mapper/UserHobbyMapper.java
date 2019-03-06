package com.shiyanlou.lesson5.mapper;

import com.shiyanlou.lesson5.domain.Hobby;
import com.shiyanlou.lesson5.domain.User;

public interface UserHobbyMapper {

      /**
     * 通过id查找hobby
     * @param id
     * @return
     */
    public Hobby findHobbyById(int id);
}
