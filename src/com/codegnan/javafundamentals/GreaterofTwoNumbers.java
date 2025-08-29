package com.codegnan.javafundamentals;

import java.util.Scanner;

public class GreaterofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		String result=num1>num2?"num1 is greater":"num2 is greater";
			System.out.println(result);

	}

}
