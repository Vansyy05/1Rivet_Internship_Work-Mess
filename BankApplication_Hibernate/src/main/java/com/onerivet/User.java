package com.onerivet;

public class User {
	private long acc_no,phone_no,cramount;
	private String name;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public long getCramount() {
		return cramount;
	}
	public void setCramount(long cramount) {
		this.cramount = cramount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(long acc_no, long phone_no, long cramount, String name) {
		super();
		this.acc_no = acc_no;
		this.phone_no = phone_no;
		this.cramount = cramount;
		this.name = name;
	}
	public User() {
		super();
	}
	
	
}
