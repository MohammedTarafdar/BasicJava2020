package collectionsFramework;

import java.util.Iterator;
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
		
		
		// .removeFirst() and .removeLast()
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Content of LinkedList : "+ll);
		System.out.println("");
		
		// .remove()
		
		ll.remove(2);
		System.out.println("Content of LinkedList : "+ll);
		System.out.println("");
		
		
		/* How to print all values of LinkedList
		 * 1. for loop
		 * 2. advance for loop
		 * 3. iterator
		 * 4. while loop
		 * 
		 */
		
		
		System.out.println("Using for loop :");
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		
		System.out.println("");
		System.out.println("Using Advanced for loop :");
		for(String str :ll) {
			System.out.println(str);
		}
		
		System.out.println("");
		System.out.println("Using iterator :");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("");
		System.out.println("Using while loop :");
		
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		

	}

}
