package com.codegnan.controlStmts;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks");
		int marks=s.nextInt();
		if(marks>=90) {
			System.out.println("grade : O");
		}
		else {
			if(marks>=80) {
				System.out.println("grade : S");
			}
			else {
				if(marks>=70){
					System.out.println("grade : A");
				}else {
					if(marks>=60){
						System.out.println("grade : B");
					}
					else {
						if(marks>=50){
							System.out.println("grade : C");
						}
						else {
							if(marks>=40){
								System.out.println("grade : D");
							}
							else {
								System.out.println("grade : f");
							}
						}
						
							
			}
		}
		

			}}
		
	}}

