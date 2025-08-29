package com.codegnan.javafundamentals;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter base");
		int base=s.nextInt();
		System.out.println("enter height");
		int height=s.nextInt();
		double area=0.5*base*height;
		System.out.println("area of traingle"+area);
		

	}

}
