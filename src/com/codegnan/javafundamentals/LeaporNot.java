package com.codegnan.javafundamentals;

import java.util.Scanner;

public class LeaporNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		String result=year%4==0?"leap year":"not a leap year";
		System.out.println(result);
		

	}

}
