package com.lambaexpressiondemo;

// by taking single parameter
interface Sayable{
	public String say(String name);
}
public class Demo2 {
	public static void main(String[] args) {
		
		Sayable s=(name)->{
			return "Hello " +name;
		};
		System.out.println(s.say(("vansyy")) );
	}
}
