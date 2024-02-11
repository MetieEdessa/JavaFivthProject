package com.day4homework;
//create a public employee class -> name , age, phonenumber as public,
//-private salary, bonus, protected noOfhours.

public class Employee {
	
public String name;
public int age;
public	int phonenumber;
	
private double salary;
private double bonus;
protected double noOfhourse;

//parameterized constructor with name and age, salary
public Employee (String name,int age,double salary) {
	this.name= name;
	this.age= age;
	this.salary=salary;
}

public void method10() {
	System.out.println("me1");
}
public void method12() {
	System.out.println();
}
public void method3() {
	System.out.println("me2");
}
private void method1() {
	System.out.println("me3");
}
//1 private static parameterized method.
private static void sample1(String name,int age,double salary) {
	System.out.println("name"+age+salary);
}
//public non static parameterized method
public void sample2(String name,int age,double salary) {
	System.out.println("name"+age+salary);
}	
public double AdditionOfSalaryAndBonus(){
	return this.salary + this.bonus;
	
	
	}
}


