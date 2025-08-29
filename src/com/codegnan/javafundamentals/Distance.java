package com.codegnan.javafundamentals;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int km=s.nextInt();
		double fare=(km<=2)?50
				:(km<=10)?(50+(km-2)*15)
						:(50+(8*15)+(km-10)*10);
		fare=(km>20)?fare*0.95:fare;
		System.out.println(fare);
		
	}

}
