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
		
		

	}

}
