package com.codegnan.javafundamentals;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count+=1;
			}
		}
		if(count==2) {
			System.out.println("the number is prime");
		}
		else {
			System.out.println("not a prime");
		}

	}

}
