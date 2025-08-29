package com.codegnan.javafundamentals;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		double amount=s.nextDouble();
		double discount= (amount>=100)?0.2:(amount>=50)?0.1:0.0;
		double discountAmount=amount*discount;
		double remainingamount=amount-discountAmount;
		double percentDiscount=discount*100;
		System.out.println("amount after applying" +percentDiscount+"%discount"+remainingamount);
		System.out.println("discount applied :"+discountAmount);
				

	}

}