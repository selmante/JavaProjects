package com.sprintqa.java.reviewclass;

public class LogicalProgramExample {

	public static void main(String[] args) {
  int num1=15,i;
  boolean flag= true;
  
 for (i=2; i<=num1-1; i++) {
	 if (num1 % i==0) {
	
	 System.out.println("num1 is not prime");
	 break;
	 }
		    }
 if (i==num1)  { System.out.println("num1 is prime");
  } 
	
	}
}
