package com.java.basic;

public class StaticMethodCallingOne {

	public static void main(String[] args) {
		
		System.out.println("method one");
		
		// Can i call main method from other class?
		
		// => yes, like
		
		StaticMethodCallingTwo.main(args);
		

	}

}
