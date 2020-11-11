package com.interview.question;

public class ReverseString {
	
	// Can you reverse a String without and with existing function?
	// String vs StringBuffer vs StringBuilder
	// Do we have reverse method in string class?

	public static void main(String[] args) {
		
		// without using existing function
		
		String name = "Mohammed";
		
		int len = name.length();
		String revName ="";
		
		for (int i = len-1; i >=0; i--) {
			revName = revName+name.charAt(i);
			
		}
		System.out.println("My reverse name is : "+revName);
		
		// With the use of existing method
		
		String lName ="Tarafdar";
		
		StringBuffer sBuffer = new StringBuffer(lName);
		System.out.println("My reverse last name is : "+sBuffer.reverse());
		

	}

}
