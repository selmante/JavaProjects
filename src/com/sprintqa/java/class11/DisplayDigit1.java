package com.sprintqa.java.class11;

import java.util.Scanner;

public class DisplayDigit1 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		
		while (num1!=0) {
			System.out.println(num1%10);
			
			num1 = num1/10;
		}

	}

}
