package com.codegnan.javafundamentals;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      String result=num%2==0?"Even number":"odd number";
      System.out.println(result);
      
	}

}
