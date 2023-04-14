package com.java101.basics;

import java.awt.Point;

public class Variables {
	public static void main(String[] args) {
		Point point1= new Point(1,1);
		Point point2=point1;
		point1.x=2;
		System.out.println(point2);
		
		int a=30; // data type identifier assignment operator value
		int b=31;
		a=32;
		System.out.println("variable b value is : "+b);
	}

	/**
	 * In Java, reference types are data types that store references or memory
	 * addresses of objects rather than the actual values. When a variable of a
	 * reference type is declared, it contains a reference to an object, but the
	 * actual object is not created until the new operator is used to create it.
	 */
}
