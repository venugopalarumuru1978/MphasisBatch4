package com.lambdaexpression_pack;
// functional interface
interface Drawable
{
	void draw();
}

public class LambdaEx1 {

	public static void main(String[] args) {

		// without lambda expression
		Drawable dr = new Drawable()
		{
			public void draw()
			{
				System.out.println("This is Draw method");
			}
		};
		
		dr.draw();
	}
}
