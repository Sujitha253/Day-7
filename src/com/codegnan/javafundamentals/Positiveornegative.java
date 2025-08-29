package com.codegnan.javafundamentals;

import java.util.Scanner;

public class Positiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String result=num>0?"positive":"negative";
		System.out.println(result);
		

	}

}
