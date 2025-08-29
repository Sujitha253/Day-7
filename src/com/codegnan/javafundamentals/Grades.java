package com.codegnan.javafundamentals;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
		String grade=(marks>=90)?"O":(marks>=80)?"S":(marks>=70)?"A":(marks>=60)?"B":(marks>=50)?"c":(marks>35)?"d":"f";
		System.out.println(grade);
		

	}

}
//if marks>=90--->o
//marks>=80-->s
//marks>=70-->a
//marks>=60-->b
//marks>=50--->c
//marks>=35-->d
//marks<=35--->f