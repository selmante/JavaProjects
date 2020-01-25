package com.sprintqa.java.deneme;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		System.out.println("Please enter the temperature");
		int temperature;
		
		Scanner sc= new Scanner (System.in);
		temperature=sc.nextInt();
		
		if (temperature>100) {
			System.out.println("Stay inside it's too hot");}
		else if (temperature>50 && temperature<99 ) {
			System.out.println("Wear winter clothes");}
		else if (temperature>30 && temperature<49 ) {
			System.out.println("Wear winter clothes");}
		else if (temperature>10 && temperature<29 ) {
			System.out.println("Stay inside it's too cold");}
		else {
			System.out.println("Call for help it's too cold outside");}
	}

}
