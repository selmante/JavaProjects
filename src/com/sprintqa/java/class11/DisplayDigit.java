package com.sprintqa.java.class11;

import java.util.Scanner;

public class DisplayDigit {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1= sc.nextInt();
		
	
	int answer, answer1;
	answer = num1%10;
			System.out.println(answer);
	answer1 = (num1/10)%10;
	
	System.out.println(answer1);
	
	System.out.print(num1/100%10);
	}

}
