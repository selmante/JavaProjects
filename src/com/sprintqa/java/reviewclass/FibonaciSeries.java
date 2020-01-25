package com.sprintqa.java.reviewclass;

public class FibonaciSeries {

	public static void main(String[] args) {
 int cumulate =0;
 int limit =20, num1 =0, num2=1;
 
		//for (int i; i<20; i++) {
		
		System.out.println(num1);
		System.out.println(num2);
		cumulate=num1+num2;
		
		while (cumulate<limit) {
			
		System.out.println(cumulate);
	num1=num2;
	num2= cumulate;
	cumulate=num1+num2;

		}
	}
}
