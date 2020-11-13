package com.java.t.point;

public class HelloJavaClass {
	
	String string = "Hello Java";

	public static void main(String[] args) {
		
		System.out.println("Hello Java");
		
		String s1 = "Hello Java";
		System.out.println(s1);
		
		char[] chArray = {'H','e','l','l','o','J','a','v','a'};
		System.out.println(chArray);
		
		HelloJavaClass hello = new HelloJavaClass();
		System.out.println(hello.string);
		
		// use of charAt() method
		
		String st = "Welcome";
		System.out.println("The second charecter of the word is : "+st.charAt(1));
		
		int lengthOfWord = st.length();
		System.out.println("The length of word is : "+lengthOfWord);
		

	}

}
