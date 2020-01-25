package com.sprintqa.java.class12;

public class SumOfArrayElementUsingForEach {

	public static void main(String[] args) {
		int salary[]= {2000, 5000, 1000, 500, 400, 700, 600, 600, 1200, 900};
		int sum=0;
		
		for (int empSalary : salary) {
		
			sum = sum + empSalary;
		}
					System.out.println(sum);
		}
	}


