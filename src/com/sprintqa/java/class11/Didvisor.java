package com.sprintqa.java.class11;

public class Didvisor {

	public static void main(String[] args) {
		int num1 = 45;
		int numorg=num1;
		int sum=0;
		for (int i=1; i<num1; i++) {
			
		if (num1%i==0) {
		sum=sum+i;
		}
		}
		if (sum==numorg) {
		System.out.println("perfect");
		} else {
			System.out.print("not perfect");
			}
		}
		
	}
	

