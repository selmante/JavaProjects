package SelfStudy;

import java.util.Scanner;

public class SelfStudy7 {

	public static void main(String[] args) {
		int numbers[]= new int[10]; 
		int positiveSum=0, negativeSum=0;
		Scanner sc=new Scanner(System.in);
		
		int i;

	        numbers[i]=sc.nextInt();
		for (i=0; i<numbers.length; i++) {
			if (numbers[i]>0) {
				positiveSum=positiveSum+numbers[i];
			}else { negativeSum=negativeSum+numbers[i];
		}
			}System.out.println(positiveSum);
		System.out.println(negativeSum);

	}

}
