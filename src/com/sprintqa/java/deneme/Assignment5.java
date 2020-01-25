package com.sprintqa.java.deneme;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		System.out.println("Enter your age:");
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age>=18 && age<60) 
			
		{System.out.print("You are eligible for work");

	}
		else if (age<18) {
			System.out.print("You’re Minor.");
		}
		else 
			System.out.print("You’re not eligible for work");
			
	}
}
