package com.sprintqa.java.deneme;

import java.util.Scanner;

public class Assignment6 {
	/*Create a program that asks a user to enter the quantities for the following coins:
 *  pennies, nickels, dimes, and quarters. Your program should count up the value of all
 *   the change. If it is exactly $1, they win! If it is more than $1, tell them by 
 *   how much they went over. If it is less than $1, tell them by how much they went
 *   under.*/

	public static void main(String[] args) {
		System.out.println("How many pennies?");
		System.out.println("How many nickels?");
		System.out.println("How many dimes? ");
		System.out.println("How many quarters?");
		
		Scanner sc = new Scanner(System.in);
		int pennies =sc.nextInt();	
		int nickels = sc.nextInt();
		int dimes= sc.nextInt();
		int quarters= sc.nextInt();
		double calculate;
		
		calculate= 0.01 * pennies + 0.05 * nickels + 0.02 * dimes + 0.25 * quarters ;
			
    if (calculate ==1) {
    	System.out.println("Hurray! It is $1.00! You win!");
    } else if (calculate <1) 
    	System.out.println("It is" + " " + (1-calculate)+ " " + "less than $1.00!");
    else 
    {System.out.println("It is" +" " + (calculate-1)+ "  " + "more went over" );}

    { 
    }
	}
}

