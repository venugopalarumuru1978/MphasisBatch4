package com.lambdaexpression_pack;
import java.util.*;
import java.util.stream.Collectors;

public class Streams_LambdaEx2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,6);
		// show all values multiply with 10
		System.out.println("Actual Values : " + list);
		
		list.stream().map(n-> n*10).forEach(System.out::println);
		
		List<Integer>  Intvalues = list.stream().map(n->n*10).collect(Collectors.toList());
		System.out.println("Result : " + Intvalues);
		
		// Find Sum of array values 
		System.out.println("Sum Value is : " + list.stream().collect(Collectors.summingInt(Integer::intValue)));
		
		// find the max value from array
		Optional<Integer>  max = list.stream().collect(Collectors.maxBy(Integer::compare));
		
		System.out.println("Max Value is : " + max.get());
	}
}
