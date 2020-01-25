package com.sprintqa.java.deneme;

import java.util.Scanner;

public class Assignment10 {

	private static final char A = 0;

	public static void main(String[] args) {
		System.out.println("Please Enter your Grade");
		Scanner sc=new Scanner(System.in);
		char grade =sc.next().charAt(0);
		
		switch (grade) {
		
		case 'A': 
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'E':
			System.out.println("Bad");
			break;
		default:
			System.out.print("Please enter grade letters A,B,C or E");
		}
	}

}
