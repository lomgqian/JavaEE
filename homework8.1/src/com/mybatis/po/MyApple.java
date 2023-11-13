package com.mybatis.po;

public class MyApple {
	private Integer uid;
	private String uname;
	private String uprice;
	
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getuprice() {
		return uprice;
	}
	public void setuprice(String uprice) {
		this.uprice = uprice;
	}
	
	@Override
	public String toString() {
		return "苹果 [uid=" + uid +",苹果名" + uname + ",苹果价格" + uprice +"]";
	}
}
