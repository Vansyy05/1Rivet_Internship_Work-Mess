package com.lambaexpressiondemo;

//ForEach
import java.util.ArrayList;
import java.util.List;

public class Demo4 {
	public static void main(String[] args) {
		List <String>list=new ArrayList<String>();
		list.add("Vanshika");
		list.add("Nency");
		list.add("Gracy");
		list.add("Khyati");
		
		list.forEach((n)->System.out.println(n));
	}
}
