package com.sprintqa.java.class9;

import java.util.Scanner;

public class NestedLoopExample2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int numberOfRow=sc.nextInt();
		
		int numberOfCol=sc.nextInt();
		
		for (int i=1; i<=numberOfRow; i++) {
			
			for ( int j =1; j<=numberOfCol; ++j) {
				
		System.out.print(j + " ");
		} 
		
		System.out.println();
	}

}
}