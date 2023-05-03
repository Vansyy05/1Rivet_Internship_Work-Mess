package com.application;

import java.util.Scanner;

class UserDetail{
	Scanner sc=new Scanner(System.in);
	
	//method for Employee Id
	public void UserId() {
	System.out.println("Enter Your Id: ");
	int id=sc.nextInt();
	System.out.println(id);
	}
	
	//method for Employee name
	public void UserName() {
		System.out.println("Enter Name: ");
		String name=sc.next();
		System.out.println(name);
	}
	
	//method for Employee Age
	public void UserAge() {
		System.out.println("Enter Age: ");
		short age=sc.nextShort();
		System.out.println(age);
	}
	
	//method for Employee city
	public void Usercity() {
		System.out.println("Enter City: ");
		String city=sc.next();
		System.out.println(city);
	}
	

//public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UserDetail d=new UserDetail();
		System.out.println("Enter Details: ");
		int s=sc.nextInt();
		d.UserName();
	}
}
