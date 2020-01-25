package com.sprintqa.java.class13;

public class StringManipulation3 {

	public static void main(String[] args) {
	String str1 = "Welcome to Ebay";
	String str2 = "EBAY";
	String string3 = new String("Geeks"); 
    String string4 = new String("Geeks"); 
    String string5 = new String("geeks"); 

	
	System.out.println(str1.compareTo(str2));
	System.out.println(str1.toLowerCase());
	System.out.println(str2.toUpperCase());
	System.out.println(string3.equals(string4));
	System.out.println(string4.equals(string5));
	System.out.println(string4.compareToIgnoreCase(string5));
	System.out.println(string4.equalsIgnoreCase(string5));
	System.out.println(str1.contains(str2));
	
	}

}
