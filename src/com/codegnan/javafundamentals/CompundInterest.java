package com.codegnan.javafundamentals;

import java.util.Scanner;

public class CompundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.print("Enter Principal: ");
       int principal = s.nextInt();

       System.out.print("Enter Rate of Interest: ");
       int rate = s.nextInt();

       System.out.print("Enter Time (in years): ");
       int time = s.nextInt();

       System.out.print("Enter number of times interest compounded per year: ");
       int n = s.nextInt();
       double amount = principal * Math.pow((1 + (rate / (n * 100))), n * time);
       double ci = amount - principal;

       System.out.println("Compound Interest = " + ci);
       System.out.println("Total Amount = " + amount);

	}

}
