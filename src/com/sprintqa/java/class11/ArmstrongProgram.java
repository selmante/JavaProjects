package com.sprintqa.java.class11;

public class ArmstrongProgram {

	public static void main(String[] args) {
		
		int num1 =153, sum=0, lastDigit, backupOfNum1=num1;
		
		while (num1 !=0) {
			lastDigit = num1%10;
			sum=sum+lastDigit*lastDigit*lastDigit;
		num1=num1/10;
		
		}
		System.out.println(sum);
		System.out.println(backupOfNum1);
		
		if (sum==backupOfNum1) {System.out.println("number is armstrong");
		}else {System.out.println("number is not armstrong");
		
		}
		
		}
		
}