package com.interview.question;

public class RemoveUnwantedCharecters {
	
	// How do you remove unwanted charecters from your string?

	public static void main(String[] args) {
		
		// with the help of regular expression[^a-zA-Z0-9]
		
		String string = "Hi, &#@!~&^%* 0 123 asvlhaa 0ob8bi9# #3gld&";
		
		string = string.replaceAll("[^a-zA-Z09]", "");
		System.out.println(string);
		
		String name = "My *&^% name %^^# is Ashik ###** and ~!!!age is 40 years";
		
		name = name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(name);

	}

}
