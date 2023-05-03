package com.springdemoStudent;

public class Student {
	private int sid,sage;
	private String sname;
	private String saddress;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	
	public Student(int sid, int sage, String sname,String saddress) {
		super();
		this.sid = sid;
		this.sage = sage;
		this.sname = sname;
		this.saddress = saddress;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return this.sid+" : "+this.sname+" : "+this.saddress+" : "+this.sage+" : ";
	}
	
	
	
	
	
}
	