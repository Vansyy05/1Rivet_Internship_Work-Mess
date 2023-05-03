package com.lambaexpressiondemo;
import java.util.*;
import java.util.stream.Collectors;


class Person{
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
}
public class Demo6 {
	public static void main(String[] args) {
		List<Person> list=Arrays.asList(
				new Person("Vanshika",22),
				new Person("Gracy",26));
		
		List<Person> filteredList=list.stream().filter(p->p.getAge()>25).collect(Collectors.toList());
		System.out.println("People whose age is greater than 25");
		filteredList.forEach(System.out::println);
		
		
	}
}
