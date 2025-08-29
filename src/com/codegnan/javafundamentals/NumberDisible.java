package com.codegnan.javafundamentals;

import java.util.Scanner;

public class NumberDisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int num1=s.nextInt();
        int num2=s.nextInt();
        boolean result= (num%num1==0)&&(num%num2==0);
        System.out.println(result);
	}

}
