package com.java.t.point;

public class StringExample {

	public static void main(String[] args) {
		
		// String Literal
		String s1 = "Hello";
		System.out.println(s1);
		
		// char array
		char[] ch = {'H','e','l','l','o'};
		System.out.println(ch);
		
		// by new keyword
		String string = new String(ch);	
		System.out.println(string);
		
		String s2 = new String("Hello");
		String s3 = new String("Java");
		
		System.out.println(s2);
		System.out.println(s3);
		
		// trim() => removes beginning and ending spaces of this string.
		
		String student1 = " Mohammed A Rahman ";
		String newStudent1 = student1.trim();
		System.out.println(newStudent1);
		
		// toUpperCase() => returns a string in uppercase.
		String student2 = "apple bat book cookies eggs ";
		String newStudent2 = student2.toUpperCase();
		System.out.println(newStudent2);
		
		// toLowerCase() => returns a string in lowercase.
		String student3 = "RAINBOW RED BANANA ORANGE STRAWBERRY SANDWICH";
		String newStudent3 = student3.toLowerCase();
		System.out.println(newStudent3);
		
		// indexOf() => returns the specified char value index.
		String student4 = "AFIA UMAR SADAF LABIBA RAINBOW RED BANANA ORANGE";
		int numOfplace = student4.indexOf("R");
		System.out.println(numOfplace);
		
		//
		String stu5 = "Afia&Umar";
		String [] arrayofStu5 = stu5.split("&");
		for(String s : arrayofStu5)
		System.out.println(s);
		
		
		
		

	}

}
