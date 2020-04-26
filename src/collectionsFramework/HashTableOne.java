package collectionsFramework;

import java.util.Hashtable;

public class HashTableOne {

	public static void main(String[] args) {
		// 
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Sadaf");
		ht.put(2, "Afia");
		ht.put(3, "Labiba");
		
		System.out.println("Elements of Hashtable :");
		System.out.println(ht);
		System.out.println(" ");
		
		
		// Create a clone/shallow copy:
		
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		
		ht1 = (Hashtable)ht.clone();
		
		System.out.println(" Elements of ht is :"+ht);
		System.out.println(" Elements of ht1 is :"+ht1);
		
		

	}

}
