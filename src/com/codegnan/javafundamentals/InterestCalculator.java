package com.codegnan.javafundamentals;

import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
         System.out.print("Enter Rate of Interest (per annum): ");
        double rate = sc.nextDouble();
         System.out.print("Enter Time (in months): ");
        int months = sc.nextInt();
        double timeYears = months / 12.0;
        double si = (principal * rate * timeYears) / 100;
        double totalSI = principal + si;
        System.out.print("Enter number of times interest compounded per year: ");
        int n = sc.nextInt();
        `eeeedouble amount = principal * Math.pow((1 + (rate / (n * 100))), n * timeYears);
        double ci = amount - principal;
        System.out.println("Simple Interest = " + si);
        System.out.println("Total Amount (SI) = " + totalSI);
        System.out.println("Compound Interest = " + ci);
        System.out.println("Total Amount (CI) = " + amount);
	}

}
