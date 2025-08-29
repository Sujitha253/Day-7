package com.codegnan.javafundamentals;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String stname=s.nextLine();
		int rollno=s.nextInt();
		int age=s.nextInt();
		System.out.println("the student name : "+stname);
		System.out.println("the student age : "+age);
		System.out.println("the student rollno : "+rollno);
		
	}

}
