package com.lambaexpressiondemo;

//Multiple Parameter
@FunctionalInterface
interface Addition{
	int add(int a,int b);
}
public class Demo3 {
	public static void main(String[] args) {
		
		Addition add1=(a,b)->(a+b);
			System.out.println(add1.add(10, 5));
		}
	}

