package com.sprintqa.java.deneme;

import java.util.Scanner;

public class Calculator {
		
	int r;
	static int n1;
	static int n2;
		static String c;
		static void main(String[] args) {
			   Scanner Calc = new Scanner(System.in);
		     	
		  System.out.println("Enter the first number: ");
	        n1 = Calc.nextInt();
	        System.out.println("Enter the second number:" );
	        n2 = Calc.nextInt();
	        System.out.println("Select the order of operation: ");
	    switch(c)
			{
			case '1':
				r=n1+n2;
				break;
			case '2':
				r=n1-n2;
				break;
			case '3':
				r=n1*n2;
				break;
			case '4': 
				r=n1/n2;
				break;
			case '5':
				r=n2*100/n1;
				break;
			default:
				break;
					
			}
		

			

		}
		
		
		
		/* static void main(String[] args) {
		   Scanner Calc = new Scanner(System.in);
	        int n1;
	        int n2;
	        int Answer;

	        System.out.println("Enter the first number: ");
	        n1 = Calc.nextInt();
	        System.out.println("Enter the second number:" );
	        n2 = Calc.nextInt();
	        System.out.println("Select the order of operation: ");
	    
	        if (operator == '+') {
	            Answer = (n1 + n2);
	            System.out.println("Answer:" + Answer);
	            } 
	        else if (operator == '-') {
	            Answer = (n1 - n2);
	            System.out.println("Answer:" + Answer);
	            } 
	        else if (operator == '*') {
	            Answer = (n1 * n2);
	            System.out.println("Answer:" + Answer);
	            } 
	        else if (operator == '/') {
	            Answer = (n1/n2);
	            System.out.println("Answer:" + Answer);
	            } 
	        else {
	            System.out.println("not implemented yet. Sorry!");
	        }


	}

}*/

