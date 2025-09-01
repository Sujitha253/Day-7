package com.codegnan.controlStmts;

import java.util.Scanner;

public class LocationWishes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        String location=s.next();
        if(location.equalsIgnoreCase("hyderabad")) {
        	System.out.println("Hello Hyderabadi...adhab");
        }
        	else {
        		if(location.equalsIgnoreCase("Banglore")) {
                	System.out.println("Hello kkannadiga...namaskara");
        		}
                	else {
                		if(location.equalsIgnoreCase("Chennai")) {
                        	System.out.println("Hello madrasi...vanakkam");
                		
                	}
                		else {
                			System.out.println("please enter valid name");
                		}
        	}
        }
	                                                                                                                                                                                           

}
//positive or -ve or 0
//talktym lessthan 100minutes basic plan talktime>100 and