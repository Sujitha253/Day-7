package com.codegnan.javafundamentals;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        double bill=s.nextInt();
        double finalbill=bill>1000?bill*0.10:bill;
        System.out.println(finalbill);
        
        
	}

}
