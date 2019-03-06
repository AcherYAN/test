package com.shiyanlou.lesson5.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Job {

      // 工作主键
    private int id;
      // 工作名称
    private String name;
      // 工作描述
    private String description;

    // 一对多 哪些用户拥有该工作
    @JsonInclude(Include.NON_DEFAULT)
    private List<User> users;

    // 构造函数
    public Job() {
        super();
        // TODO Auto-generated constructor stub
    }

    // 构造函数
    public Job(String name, String description, List<User> users) {
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
        return "Job [id=" + id + ", name=" + name + ", description=" + description + ", users=" + users + "]";
    }
}