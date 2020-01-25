package com.sprintqa.class10;

public class PatternProgramHomework {

	public static void main(String[] args) {
		//     1
		 //   121
		 //  12321
		 // 1234321
	 //    123454321
int spc = 0;
		for (int i=1; i<=5; i++) {
			spc=i-spc; System.out.println(" ");
			for (int j=1; j<=i; j++) {
			
			System.out.print(j);}
		}System.out.println();
	


for (int i=1; i<=5; i++) {
	
	for (int j=1; j<=i; j++) {
		spc=5-i; System.out.print(" ");
	System.out.print(j);}
}System.out.println();
}
}