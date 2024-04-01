package com.lambdaexpression_pack;
import java.util.*;
import java.util.stream.Collectors;
public class Streams_LambdaEx4 {

	public static void main(String[] args) {

		List<Products>  prdList = Arrays.asList(
				new Products(101, "Iphone", 20, "Mobiles"),
				new Products(102, "Washing Machine", 40, "HouseHold"),
				new Products(103, "Samsung AC", 20, "HouseHold"),
				new Products(104, "OnePlus", 23, "Mobiles"),
				new Products(105, "Google Phone", 20, "Mobiles")
				);
		
		System.out.println("All Products : ");
		
		prdList.forEach(pd->System.out.println(pd));
		
		// print all products based on Category
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Category : ");
		String ct = sc.next();
		
		List<Products>  prdListCatWise = prdList.stream().filter(p->p.getCat().equals(ct)).collect(Collectors.toList());

		if(prdListCatWise.isEmpty())
		{
		System.out.println("No Products exist with given category");
		}
		else
		{
			System.out.println("Products based on Category");
			prdListCatWise.forEach(pd->System.out.println(pd));
		}
	}
}
