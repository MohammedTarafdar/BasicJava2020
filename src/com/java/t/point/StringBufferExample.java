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
	}

}
