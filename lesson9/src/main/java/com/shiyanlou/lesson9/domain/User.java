package com.shiyanlou.lesson9.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
public class User implements Serializable{

    private static final long serialVersionUID = 1L;
      // 主键自增id
    private int id;
      // 姓名
    private String name;
      // 性别
    private int gender;
      // 年龄
    private int age;
      // 密码
    private String password;

      // 构造函数
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    // 构造函数
    public User(String name, int gender, int age, String password) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.password = password;
    }

      // 属性setter、getter方法
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

      // 重写toString方法
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", password=" + password + "]";
    }
}