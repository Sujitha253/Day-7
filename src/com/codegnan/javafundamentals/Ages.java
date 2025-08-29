package com.codegnan.javafundamentals;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		String group=(age>=50)?"old":(age>=40)?"middle age":(age>18)?"major":"child";
		System.out.println(group);	

	}

}
