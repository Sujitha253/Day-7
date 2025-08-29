package com.codegnan.javafundamentals;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter principal amount: ");
		int p=s.nextInt();
		System.out.println("enter time : ");
		int t=s.nextInt();
		System.out.println("enter rate : ");
		int r=s.nextInt();
		int SI=(p*t*r)/100;
		int totalamount=p+SI;
		System.out.println("simple interest : " +SI);
		System.out.println("total amount : " +totalamount);
		

	}

}
