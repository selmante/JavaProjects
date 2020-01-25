package com.sprintqa.java.assignment;

import java.util.Scanner;

public class assignment4 {
	public static void main(String[] args) {
	System.out.println("0");
	
	
	Scanner sc = new Scanner(System.in); {
	int	num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	Scanner sca = new Scanner(System.in);
	char operator = sca.next().charAt(0);

	
	
	
	if(operator=='+') {

	

		System.out.println(num1 + num2);
		
	}else if(operator=='-') {
	
		System.out.println(num1-num2);}
		
	
	
	//	System.out.println(num1*num2);
	//	System.out.println(num1/num2);
		
}
}
}


