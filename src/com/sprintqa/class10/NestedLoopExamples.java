package com.sprintqa.class10;

public class NestedLoopExamples {

	public static void main(String[] args) {
	
		for(int i =1; i<=9-0; i++) {
			for (int k=1; k<=9-i; k++) {
				System.out.print(" ");
			}
          for(int j=1; j<=i; j++) {
        	  System.out.print(" *");
          }
          System.out.println();
	}
		}
	}
