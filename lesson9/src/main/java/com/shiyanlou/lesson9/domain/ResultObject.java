package com.shiyanlou.lesson9.domain;

public class ResultObject {

      // 后台状态
    private int code;
      // 相关消息
    private String msg;
      // 后台返回数据
    private Object result;

      // 构造函数
    public ResultObject() {
        super();
        // TODO Auto-generated constructor stub
    }
      // 构造函数
    public ResultObject(int code, String msg, Object result) {
        super();
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

      // 属性setter、getter方法
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getResult() {
        return result;
    }
    public void setResult(Object result) {
        this.result = result;
    }

      // 重写toString方法
    @Override
    public String toString() {
        return "ResultObject [code=" + code + ", msg=" + msg + ", result=" + result + "]";
    }
}
