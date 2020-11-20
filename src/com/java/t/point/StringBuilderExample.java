package com.java.t.point;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		// append()
		StringBuilder sBuilder = new StringBuilder("Basic Java Tutorial");
		StringBuilder nsBuilder=sBuilder.append(" 2020");
		System.out.println(nsBuilder);
		
		// delete()
		System.out.println(nsBuilder.delete(19, 24));
		
		// reverse()
		System.out.println(nsBuilder.reverse());
		
		
		

	}

}
