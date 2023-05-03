package com.spring.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="student")
@Data
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private int phone_no;
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public int getPhone_no() {
//		return phone_no;
//	}
//	public void setPhone_no(int phone_no) {
//		this.phone_no = phone_no;
//	}
//	public StudentEntity(int id, String name, String address, int phone_no) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//		this.phone_no = phone_no;
//	}
//	public StudentEntity() {
//		super();
//	}
//	@Override
//	public String toString() {
//		return "StudentEntity [id=" + id + ", name=" + name + ", address=" + address + ", phone_no=" + phone_no + "]";
//	}
	
	
}
