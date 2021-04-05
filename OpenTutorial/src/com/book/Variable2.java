package com.book;


public class Variable2 {

	
	public static void main(String[] args) {
		int x= 10;
		int y = 5;
		System.out.println("x : "+x+", y : "+y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : "+x+", y : "+y);
	}
}
