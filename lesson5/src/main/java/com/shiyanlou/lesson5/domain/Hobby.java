package com.shiyanlou.lesson5.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Hobby {

    // 主键id
    private int id;
      // 爱好名称
    private String name;
      // 爱好描述
    private String description;

      // 拥有同一爱好的用户
    @JsonInclude(Include.NON_DEFAULT)
    private List<User> users;

      // 构造函数
    public Hobby() {
        super();
        // TODO Auto-generated constructor stub
    }

       // 构造函数
    public Hobby(String name, String description, List<User> users) {
        super();
        this.name = name;
        this.description = description;
        this.users = users;
    }

      // 属性的setter、getter方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

      // 重写toString 方法
    @Override
    public String toString() {
        return "Hobby [id=" + id + ", name=" + name + ", description=" + description + ", users=" + users + "]";
    }
}
