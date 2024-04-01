package com.lambdaexpression_pack;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Streams_LambdaEx1 {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(3,4,5,6,11,16);
		// retrive only even numbers from list
		
		list.stream()
		.filter(n->n%2==0)
		.forEach(System.out::println);

		System.out.println("------------");

		List<Integer>  evenlist = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers : " + evenlist);
		
		System.out.println("------------");
		
		Stream<String>  strStream = Stream.of("SimpliLearn", "mphais", "Bangalore", "india");
		// retrive all string which are starts with Capital Alphabet
		
		List<String>  strs = strStream.collect(Collectors.toList());
		System.out.println("All Strings : " + strs);
		System.out.println("Capital Alphabet Strings ");
		
		Stream<String>  strStream1 = Stream.of("SimpliLearn", "mphais", "Bangalore", "india");

		strStream1.filter(
				str ->Character.isUpperCase(str.charAt(0)))
		.forEach(System.out::println);
		
		Stream<String>  strStream2 = Stream.of("SimpliLearn", "mphais", "Bangalore", "india");
		List<String> strList = strStream2.filter(str->Character.isLowerCase(str.charAt(0))).collect(Collectors.toList());
		System.out.println("Lower Case Strings : " + strList);
	
	}
}
