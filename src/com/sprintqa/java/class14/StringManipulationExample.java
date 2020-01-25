package com.sprintqa.java.class14;

public class StringManipulationExample {

	public static void main(String[] args) {
		String str = "c";
		System.out.println(str.isEmpty());
     String str1 = "                 Welcome to SprintQA       ";
     String expectedTitle = "Welcome to SprintQA";
     System.out.println(str1.equals(expectedTitle));
     System.out.println(str1);
     System.out.println(str1.trim());
     
     String str2 = "I am an Automation Engineer";
     str2=str2.replace("Automation Engineer", "Programmer");
     	System.out.println(str2);
    		    		 
String str4 ="welcome to SprintQA! This is chirag from SprintQA";
String str5 ="welcome to SprintQA! This is chirag from SprintQA we are going to learn automationQA";
System.out.println(str4.indexOf("QA"));
System.out.println(str4.lastIndexOf("QA"));
System.out.println(str5.indexOf("QA", 18));     
System.out.println(str5.indexOf("QA", str5.indexOf("QA")+1));

String str6 = "Welcome to SprintQA!";
System.out.println(str6.substring(11));
System.out.println(str6.substring(10, 20));

String companyName ="Ebay!";
String trainerName = "XYZ";
String title = "Welcome To %s This is %s from %s";

System.out.println(String.format(title, companyName,  trainerName,companyName));
	
String str8 = "Amazon";
String str9 = "SprintQA!";
String str10 = "Amazon"; 
System.out.println(str8.compareTo(str9));
System.out.println(str9.compareTo(str8));
System.out.println(str8.compareTo(str10));


System.out.println("======Split=====");
// count the number of the words inside the sentence
String str11 = "Welcome-to-SprintQA";
String[] words = str11.split("-");
System.out.println(words[0]);
String str12 = "welcome to SprintQA! This is chirag from SprintQA we are going to learn automationQA";
String[] wordfind = str12.split(" ");
System.out.print(wordfind.length);
//for (int i=0; i<=20; i++) {
	//int count=0;
	//count=count+i;
	//int counter=0;
    //System.out.print(wordfind[i]);

	//count=count+i;
	//System.out.println(" " + (i+1));
}

}

	

