package com.april.practiceset;


public class Practice1 {

	static {
		System.out.println("This is static block.");
	}
	
	{
		System.out.println("This is non static block.");
	}
	
	public Practice1(){
		System.out.println("This is args constructor");
	}
	
	Practice1(int a){
		System.out.println("no-args");
	}
	public static void main(String[] args) {
		Practice1 s=new Practice1();
		Practice1 s1=new Practice1(0);
	}
}
