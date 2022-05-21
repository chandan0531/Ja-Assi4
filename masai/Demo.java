package com.masai;

public class Demo {
	
	int y = 10; // instance diff obj have diff obj
	
	static int i = 100;
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		d1.y = 20;
		
		d1.i = 200;
		
		Demo d2 = new Demo();
		
		System.out.println(d2.y);
		System.out.println(d2.i);
	}
}
