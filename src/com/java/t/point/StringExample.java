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
		
		// split() => returns a split string matching regex.
		String stu1 = "Afia&Umar";
		String [] arrayofStu1 = stu1.split("&");
		for(String s : arrayofStu1)
		System.out.println(s);
		
		// concat() => concat() method appends the string at the end
		String stu2 = "Mohammed";
		stu2.concat(" Tarafdar");
		System.out.println(stu2);
		
		stu2 = stu2.concat("Tarafdar");
		System.out.println(stu2);
		
		String newStu2 = stu2.concat(" Tarafdar");
		System.out.println(newStu2);
		
		String fName = "Mohammed";
		String mName1 = " Ashikur";
		String mName2 = " Rahman";
		String lName = " Tarafdar";
		
		System.out.println(fName);
		System.out.println(mName1);
		
		fName = fName.concat(mName1);
		System.out.println(fName);
		
		fName = fName.concat(mName1).concat(mName2);
		System.out.println(fName);
		
		String fn = "Mohammed";
		String mn1 = " Ashikur";
		String mn2 = " Rahman";
		String ln = " Tarafdar";
		
		String fullName = fn.concat(mn1).concat(mn2).concat(ln);
		System.out.println(fullName);
		
		
		
		

	}

}
