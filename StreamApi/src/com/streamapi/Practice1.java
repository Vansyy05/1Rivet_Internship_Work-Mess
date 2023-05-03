package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice1 {
	public static void main(String[] args) {
		List <Integer> list=Arrays.asList(9,1,30,87,23,1,2,30);
		list.stream().sorted().forEach(System.out::println);
		Stream<String> stream=Stream.of("Computer","C","Java");
		stream.filter(s->s.startsWith("C")).forEach(System.out::println);
		list.stream().filter(n->!list.add(n)).collect(Collectors.toList());
	}
}
