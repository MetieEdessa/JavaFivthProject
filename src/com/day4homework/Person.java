package com.day4homework;

public class Person {
	
public String name;
protected String dob;
public int creditScore;
private int ssn;
private int creditBal;
private int noOfCreditCards;

//parametrized Constructor

public Person(String name,int creditScore, int ssn, int creditBalance, int noOfCreditCards) {
this.name=name;
this.dob=dob;
this.creditScore=creditScore;
this.ssn=ssn;
this.creditBal=creditBal;
this.noOfCreditCards=noOfCreditCards;
}

//public void creditCheck() {
//	creditScore= ssn*creditBal/noOfCreditCards;
//}
//
//	public void insuranceInfo() {
//		
//	}
//public boolean insuranceCheck() {
//	healthInfo();
//	insuranceInfo();
//		
//	return true;
//	}
	private void healthInfo() {
		System.out.println("info");
//	}
//	public void Employee() {
//	
//	
	}
}
