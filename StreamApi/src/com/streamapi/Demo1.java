package com.streamapi;

import java.util.*;
import java.util.stream.Stream;

public class Demo1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(30,10,15,65,10,20);
		Stream<String> stream=Stream.of("Geeks","Of","Geeks","Practice");
		System.out.println("Filter...");
		list.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
		//stream.filter(s->s.startsWith("P")).forEach(System.out::println);
		stream.filter(str->str.endsWith("s")).forEach(System.out::println);
		System.out.println("Sort...");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("Map..");
		list.stream().map(num ->num * 3).forEach(System.out::println);
		System.out.println("Distinct...");
		list.stream().distinct().forEach(System.out::println);
		
	}
}
 	