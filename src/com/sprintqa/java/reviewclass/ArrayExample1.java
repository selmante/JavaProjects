package com.sprintqa.java.reviewclass;

public class ArrayExample1 {
// write a program to sort array element in ascending order(from smallest to largest)
// outout 
	public static void main(String[] args) {
	int numbers[] = {14, 56, 37, 0, 23, 9, 2, 80, 67};
    int minNumber, maxNumber;
	minNumber = numbers[0];
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]<minNumber) {
				minNumber=numbers[i];
				numbers[0]= numbers[i];
			System.out.println(numbers[i]);}
			
				maxNumber= numbers[i];
			if (maxNumber>numbers[0]) {
				System.out.println(maxNumber);
			}
			}
//	if (numbers[i]==0) {System.out.println(numbers[0]=0);
//	if (numbers[0]<numbers[i]) { numbers[0]=numbers[0];}
//	else {numbers[0]=numbers[i];
//	System.out.println(numbers[i]);
	}

}

	

