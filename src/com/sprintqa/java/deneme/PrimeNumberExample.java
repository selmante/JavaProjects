package com.sprintqa.java.deneme;

import java.util.Scanner;

public class PrimeNumberExample {
	public static void main(String[] args) {
		System.out.println("Please enter a number to check if it is prime");
		Scanner sc = new Scanner(System.in);
		int k= sc.nextInt();
		for (int i=2; i<=k-1; i++ ) {
			if (k%i==0) {
				System.out.println(k +" is not prime");
				
			}else {System.out.println(k +" is prime");
			break;
		}
	}
}
}