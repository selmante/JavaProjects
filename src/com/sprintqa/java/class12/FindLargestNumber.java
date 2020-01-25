package com.sprintqa.java.class12;

public class FindLargestNumber {

	public static void main(String[] args) {
		int numbers[] = {10, 35, 67, 89, 45, 10, 40, 60, 58, 7}, maxNumber;
        maxNumber = numbers[0];
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]>maxNumber) {
				maxNumber=numbers[i];
			}
		}
		System.out.println("Largest number is: " + maxNumber);
		
		
		
	int	minNumber = numbers[0];
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]< minNumber) {
				minNumber=numbers[i];
			}
		}System.out.println("Minimum number is: " + minNumber);
	}

}
