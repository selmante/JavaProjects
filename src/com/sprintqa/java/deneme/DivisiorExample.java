package com.sprintqa.java.deneme;

public class DivisiorExample {

	public static void main(String[] args) {
		int num = 28;
		int numorg=num;
		int sum =0;
		for (int i=1; i<num; i++) {
			if (num%i==0) {
		
			sum =sum+i;}
		}
			if (sum==numorg) {
				System.out.println("number is perfect");
							}
			else {
				System.out.print("number is not perfect");
				}
			}
		}
	
	


