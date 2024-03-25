package com.getters_setters_pack;

public class TestMain {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		t1.setX(100);
		t1.setY(12.45f);
		
		System.out.println("X value is : " + t1.getX());
		System.out.println("Y value is : " + t1.getY());
		
		float sm = t1.getX() + t1.getY();
		
		System.out.println("Sum value is : " + sm);
	}
}
