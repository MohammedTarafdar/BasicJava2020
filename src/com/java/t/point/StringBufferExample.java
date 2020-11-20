package com.java.t.point;

public class StringBufferExample {

	public static void main(String[] args) {
		
		// append() => append() method concatenates the given argument with string.
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Java");
		System.out.println(sb);
		
		//=> insert() method inserts the given string with string at the given position.
		StringBuffer sb1 = new StringBuffer(" Java");
		sb1.insert(0, "Hello");
		System.out.println(sb1);
		

		/* replace() => replace() method replaces the given string from the specified 
		*	beginIndex and endIndex.
		*/
		StringBuffer sb2 = new StringBuffer("Basic Java");
		sb2.replace(0, 5, "Advance");
		System.out.println(sb2);
		
		/* delete() => delete() method of StringBuffer class deletes the string from 
		 * the specified beginIndex to endIndex. 
		 */
		StringBuffer sb3 = new StringBuffer("Basic Java");
		sb3.delete(0, 6);
		System.out.println(sb3);
		
		// reverse() => is used to reverse the string.
		StringBuffer sb4 = new StringBuffer("Basic Java");
		sb4.reverse();
		System.out.println(sb4);
		
		// length() =>	is used to return the length of the string i.e. total number of characters.
		StringBuffer sb5 = new StringBuffer("Basic Java");
		int length = sb5.length();
		System.out.println(length);
		
		// substring() => StringBuffer sb5 = new StringBuffer("Basic Java");
		StringBuffer sb6 = new StringBuffer("Basic Java Tutorial");
		String newsb6= sb6.substring(11);
		System.out.println(newsb6);
		
		// substring(int beginIndex, int endIndex) => is used to return the substring 
		// from the specified beginIndex and endIndex.
		StringBuffer sb7 = new StringBuffer("quick brown fox jumps over the lazy dog");
		String newsb7=sb7.substring(6, 15);
		System.out.println(newsb7);
	}
}
