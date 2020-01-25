package com.sprintqa.java.class11;

public class ReverseNumber {

	public static void main(String[] args) {
		int num1=121, reverse=0, lastDigit, backOfnum1=num1;
		
              
                while (num1 !=0) {
			lastDigit= num1 % 10;
			reverse=reverse*10 + lastDigit;
			num1=num1/10;}
			
                  if (backOfnum1==reverse) {
                	System.out.println("Pelandrom");
                }else { System.out.println("not pelandrom");}
		
        }
	}
	
