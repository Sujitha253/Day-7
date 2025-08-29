package com.codegnan.javafundamentals;

import java.util.Scanner;

public class ternaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int age=s.nextInt();
       String result=age>=18?"eligible to vote":"not eligible";
       System.out.println(result);
	}

}
//eligible to vote or not
//positive or not
//even or odd
//leap year or not
//greater of 2numbers
//student pass or fail
//number divisible by both 3&5
//your shopping bill is more than 1000 apply 10%discount
