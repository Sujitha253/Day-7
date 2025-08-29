package com.codegnan.javafundamentals;

import java.util.Scanner;

public class Noons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int noon=s.nextInt();
		String day=(noon>=5&&noon<=12)?"Good Morning"
				:(noon>12&&noon<17)?"Good Afternoon"
						:(noon>=17&&noon<22)?"Good Evening"
								:(noon>=22&&noon<=24)?"gooodnyt":"early morning";
		System.out.println(day);

	}

}
