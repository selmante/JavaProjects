package com.sprintqa.java.deneme;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		System.out.println("Please enter the number of sales for the last week ");
		
	int WeeklyWage=800;
	int Bonus=200;
	Scanner sc=new Scanner(System.in);
	int SalesAmount=sc.nextInt();
	
    if (SalesAmount>10) {
    	
    System.out.println(WeeklyWage+Bonus+"£");
    }
    else {
    	System.out.print(WeeklyWage);
    }
	}

}
