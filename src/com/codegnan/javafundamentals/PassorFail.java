package com.codegnan.javafundamentals;
import java.util.Scanner;

public class PassorFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
		String result=marks>30?"pass":"fail";
		 System.out.println(result);
		

	}

}
