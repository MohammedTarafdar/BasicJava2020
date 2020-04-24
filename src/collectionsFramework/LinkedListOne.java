package collectionsFramework;

import java.util.LinkedList;

public class LinkedListOne {

	public static void main(String[] args) {
		// 
		
		LinkedList<String> ll = new LinkedList<String>();
		
		// To add use .add() method
		
		ll.add("Test");
		ll.add("Automation");
		ll.add("Selenium");
		ll.add("QTP");
		
		System.out.println("Content of LinkedList : "+ll);
		System.out.println("");
		
		// .addFirst()
		// .addLast()
		
		ll.addFirst("Good");
		ll.addLast("Job");
		
		
		System.out.println("Content of LinkedList : "+ll);
		System.out.println("");
		
		// .get()
		
		System.out.println(ll.get(0));
		System.out.println("");
		
		System.out.println(ll.get(2));
		System.out.println("");
		
		// .set()
		
		ll.set(0, "Functional");
		
		System.out.println("Content of LinkedList : "+ll);
		System.out.println("");
		
		
		

	}

}
