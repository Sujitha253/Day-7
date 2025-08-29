package com.codegnan.controlStmts;

import java.util.Scanner;

public class ifElseExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        double accountBalance=s.nextDouble();
        System.out.println("enter withdraw amount :");
        double withdrawamount=s.nextDouble();
        if(withdrawamount<=accountBalance) {
        	if(withdrawamount%100==0) {
        	accountBalance-=withdrawamount;
        	System.out.println("withdraw amount"+withdrawamount+"Sucessfully.. remaining balance is "+accountBalance);
        	
        }
        	else {
        		System.out.println("could not withdraw");
        	}
        }
        else{
           System.out.println("insufficinet funds");
        }
	}

}
