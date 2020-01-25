package com.sprintqa.java.deneme;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		System.out.println("0");
		
		
		Scanner sc1 = new Scanner(System.in); {
		int	num1 = sc1.nextInt();
		int num2 = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		char operator = sc2.next().charAt(0);

		
		
		
		if(operator=='+') {
	
		
	
			System.out.println(num1 + num2);
			
		}else if(operator=='-') {
		
			System.out.println(num1-num2);}
			
		
		
		//	System.out.println(num1*num2);
		//	System.out.println(num1/num2);
			
	}
	}
}

