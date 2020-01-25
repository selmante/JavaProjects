package com.sprintqa.java.deneme;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
	    System.out.println("1 – square");
	    System.out.println("2 – circle");
	    System.out.println("3 – triangle");
	    System.out.println("4 – rhombus");
	    System.out.println("Please enter a number from 1 to 4 to choose a shape from the list");
		Scanner sc = new Scanner(System.in);
		int ShapeChoice = sc.nextInt();
	
		switch (ShapeChoice) {
		
		case 1: System.out.println("You have chosen a Square");
			 break;
		case 2: System.out.println("You have chosen a circle");
			 break;
		case 3: System.out.println("You have chosen a triangle");
			 break;
		case 4: System.out.println("You have chosen a rhombus");
			break;	
		default:
			System.out.print("There is no such shape!");
			
			}	
		}
		
	}
	


