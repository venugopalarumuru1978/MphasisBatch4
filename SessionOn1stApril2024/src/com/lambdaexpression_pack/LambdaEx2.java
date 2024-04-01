package com.lambdaexpression_pack;
// functional interface
interface Drawables
{
	void draw();
}

public class LambdaEx2 {

	public static void main(String[] args) {

		// with lambda expression
		Drawables dr =()->{
			System.out.println("This is Draw method");
		} ;
		
		dr.draw();
	}
}
