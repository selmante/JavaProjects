package com.sprintqa.java.deneme;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		System.out.println("Enter your Salary");
		System.out.println("Enter your Experience");
		
		int salary, experience;
		
		Scanner sc= new Scanner(System.in);
		salary = sc.nextInt();
		experience =sc.nextInt();
		
		if (salary>=40000 && experience>=2) {
			System.out.println("Congratulations! You've qualified for a loan");
			
		}
		else 
			System.out.print("Sorry! You've not qualified for a loan");
	}

}
