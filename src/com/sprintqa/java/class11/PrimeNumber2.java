package com.sprintqa.java.class11;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		boolean flag = false;
		
		for (int i=2; i<=num1-1; i++) {
			
			if(num1==2 || num1==1)
				break;
		
			if(num1%i==0) {
				System.out.println("Number is not prime");
				flag = true;
				break;
			}
			} 
			
if (flag==false) {			
		System.out.print("Number is prime number");
		}

	}
}
