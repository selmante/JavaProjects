package com.sprintqa.java.class12;

import java.util.Scanner;

public class CostToCompanyAndSalary2 {

	public static void main(String[] args) {
		int numbers[]= new int[10]; // declaration of array and 		
		int positiveSum=0, negativeSum=0;
		Scanner sc=new Scanner(System.in);

		numbers[0]=sc.nextInt();
		
		for ( int i=0; i<numbers.length; i++ ) {
        numbers[i]=sc.nextInt();
}
		for ( int i=0; i<numbers.length; i++ ) {
			if (numbers[i]>0) {
				positiveSum = positiveSum + numbers[i];
			}else { negativeSum=negativeSum + numbers[i];
			}
		}
		System.out.println("sum of positive numbers " + positiveSum);
		System.out.println("sum of negative numbers " + negativeSum);	
	}
}
