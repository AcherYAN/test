package com.shiyanlou.lesson5.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User{

      // id 为主键
    private int id;
      // name 用户名
    private String name;

      // gender 用户性别，如果为null不返回给前端
    @JsonInclude(Include.NON_DEFAULT)
    private int gender;

      // age 用户年龄，如果为null不返回给前端
    @JsonInclude(Include.NON_DEFAULT)
    private int age;


    // 一对一 用户身份证信息
    @JsonInclude(Include.NON_DEFAULT)
    private Card card;

    // 多对一 用户工作信息
    @JsonInclude(Include.NON_DEFAULT)
    private Job job;

    // 多对多 用户爱好信息
    @JsonInclude(Include.NON_DEFAULT)
    private List<Hobby> hobbies;

      // 构造函数
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    // 构造函数
    public User(String name, int gender, int age, Card card, Job job, List<Hobby> hobbies) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.card = card;
        this.job = job;
        this.hobbies = hobbies;
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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

      // 重写toString方法
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", card=" + card + ", job=" + job + ", hobbies=" + hobbies + "]";
    }
}