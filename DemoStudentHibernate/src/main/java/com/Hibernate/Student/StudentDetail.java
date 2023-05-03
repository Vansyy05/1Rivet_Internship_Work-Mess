package com.Hibernate.Student;

public class StudentDetail {
  
	 private int id;
	 private String Name;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public StudentDetail(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public StudentDetail() {
		super();
	}
	
}
