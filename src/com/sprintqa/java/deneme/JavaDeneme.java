package com.sprintqa.java.deneme;

import java.util.Scanner;

public class JavaDeneme {

	private static final String brake = null;

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Name:");
	System.out.println("Gender:");
	System.out.println("Age:");

	
	String name = sc.nextLine();
	char gender = sc.next().charAt(0); 
	int age = sc.nextInt();
	
	
	
	System.out.println("Name:"+ name);
	System.out.println("Gender:"+ gender);
	System.out.println("Age:" + age);
	

	}

}
