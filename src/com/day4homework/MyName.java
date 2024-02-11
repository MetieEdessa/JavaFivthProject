package com.day4homework;

import java.util.Scanner;

public class MyName {
	
	
		public static void main(java.lang.String[] args) {
			// TODO Auto-generated method stub
			
			
	Scanner sc = new Scanner(System.in);
	String name="Binary";
	System.out.println(name.toUpperCase());
	
	 
	System.out.println("What is your Id");
	String id =sc.next();
	
	System.out.println("What is your mobile");
	int mobile =sc.nextInt();
	System.out.println("Mobile "+ mobile);
	
	System.out.println("Input your address");
	String addresse =sc.next();
	
	System.out.println("Address is "+ addresse.toUpperCase());

	
	}

}
