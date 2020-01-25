package com.sprintqa.java.class12;

public class CountDigit {
	// write a program to print  number of digit in given number
	public static void main(String[] args) {
		//123-3
		//12368-5
		
int num1=123;
int num2=12368, count=0;
int num3=110657476;
while (num3!=0) {
	
	num3 = num3/10;
	count++;
	System.out.println(count);
		
}

}
}