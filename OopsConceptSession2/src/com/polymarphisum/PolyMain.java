package com.polymarphisum;


class Shapes
{
	public static void Area(float r)
	{
		System.out.println("Area of Circle is : " + (3.14f*r*r));
	}
	
	public static void Area(int l, int b)
	{
		System.out.println("Area of Rectangle is : " + (l*b));
	}
	
	public static void Area(float b, float h)
	{
		System.out.println("Area of Traingle is : " + (0.5f*b*h));
	}
}


public class PolyMain {

	public static void main(String[] args) {
		Shapes.Area(4, 5);
		Shapes.Area(1.5f);
		Shapes.Area(1.5f, 2.5f);
	}

}
