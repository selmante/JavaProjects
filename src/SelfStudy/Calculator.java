package SelfStudy;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
		System.out.println("0");
		Scanner input = new Scanner(System.in);
		double num1 =input.nextDouble();
		double num2= input.nextDouble();
		String operate =input.next();}
		input.close();
		
		double result; 
	
		
		switch (operate) {
		case "+" :
			result=num1+num2;
			System.out.print(result);
			break;
		case "-" :
			result=num1-num2;
		System.out.print(result);
		 break;
		case "*": 
			result=num1*num2;
		System.out.print(result);
		break;
		case "/":
			result = num1/num2;
	   System.out.print(result);
     break;
 	}
			}
}
	


