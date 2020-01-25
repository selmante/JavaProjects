package com.sprintqa.java.class11;

public class DigitCalculation {

	public static void main(String[] args) {
		int num1=372;
        int sum=0;
        int lastDigit;
        	while (sum !=0) {
			lastDigit= num1 % 10;
        
        	sum=sum +lastDigit;
			num1=num1/10;
        	}
		System.out.println(sum);
	

	}

}
