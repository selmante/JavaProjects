package com.sprintqa.java.class12;

public class TwoDimensionalArray {

	public static void main(String[] args) {

int numbers[][]= {{10,20,30}, {40,50,60},{70,80,90}};
int sum=0;
for (int i=0; i<numbers.length; i++) {
	sum=0;
for (int j=0; j<numbers[i].length; j++) { 	
		sum=sum+ numbers[i][j];
		
}
 System.out.println("Sum of Row" + i +"=" + sum );
}
	
}
}

