package com.sprintqa.java.class13;

public class StringManipulation2 {

	public static void main(String[] args) {
		//reverse the statement
		
		String original = "SprintQA";
		
		for (int i=1; i<= original.length(); i++) {
			
			System.out.print(original.charAt(original.length()-i));
	}

}
}