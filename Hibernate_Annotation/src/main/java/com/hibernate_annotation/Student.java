package com.hibernate_annotation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Student {
	@Id
	private int sid;
	private String Name,Address,Age;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public Student(int sid, String name, String address, String age) {
		super();
		this.sid = sid;
		Name = name;
		Address = address;
		Age = age;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return this.sid+"  : "+this.Name+" : "+this.Address+" : "+this.Age+" : ";
	}
	
	
	
	
}
