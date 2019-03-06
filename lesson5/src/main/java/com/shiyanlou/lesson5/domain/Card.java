package com.shiyanlou.lesson5.domain;

public class Card {

      // 身份证主键id
    private int id;
      // 身份证号码
    private int code;
      // 身份证等级
    private int level;

    // 构造函数
    public Card() {
        super();
        // TODO Auto-generated constructor stub
    }

    // 构造函数
    public Card(int code, int level) {
        super();
        this.code = code;
        this.level = level;
    }


    // 属性的setter、getter方法
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    // 重写toString 方法
    @Override
    public String toString() {
        return "Card [id=" + id + ", code=" + code + ", level=" + level + "]";
    }
}