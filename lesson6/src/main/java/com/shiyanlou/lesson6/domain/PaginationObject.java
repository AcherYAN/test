package com.shiyanlou.lesson6.domain;

public class PaginationObject {

  	// 结果
	private Object list;
  	// 第几页
	private int pageNum;
  	// 每页记录个数
	private int pageSize;
  	// 记录总数
	private long total;

  	// 构造函数
	public PaginationObject() {
		super();
		// TODO Auto-generated constructor stub
	}

   	// 构造函数
	public PaginationObject(Object list, int pageNum, int pageSize, long total) {
		super();
		this.list = list;
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.total = total;
	}

  	// 属性getter、setter方法
	public Object getList() {
		return list;
	}
	public void setList(Object list) {
		this.list = list;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}

  	// 重写toString方法
	@Override
	public String toString() {
		return "PaginationObject [list=" + list + ", pageNum=" + pageNum + ", pageSize=" + pageSize + ", total=" + total + "]";
	}
}