package com.sprintqa.java.deneme;

public class SelfStudy {

	public static void main(String[] args) {
		// 1 + 2 – 3+ 4 + 5 – 6 + 7 + 8 – 9 +10
		int sum =0;
		int sub =0;
		for(int i=1; i<=10; i++) {
			if (i%3==0)
			sub=sub - i;
		if (i%3!=0)
			sum = sum + i;
			}System.out.println(sum+sub);
	
	}

}
