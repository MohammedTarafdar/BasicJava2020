package collectionsFramework;

import java.util.HashSet;
import java.util.Iterator;


/* # What is set in java collection?
 * => A Set is a Collection that cannot contain duplicate elements. There are three main implementations 
 * of Set interface: HashSet, TreeSet, and LinkedHashSet. 
 * 
 * # What is hashSet in java collection?
 * HashSet class implements Set Interface. It represents the collection that uses a hash table for storage. 
 * ( Hashing is used to store the elements in the HashSet). HashSet is the best-performing implementation; 
 * however it makes no guarantees concerning the order of iteration. 
 * 
 * # Points to Note about HashSet:
 *
 * 1. HashSet doesn’t maintain any order, the elements would be returned in any random order.
 * 2. HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
 * 3. HashSet allows null values however if you insert more than one nulls it would still return only one null value.
 * 4. HashSet is non-synchronized.
 * 5. The iterator returned by this class is fail-fast which means iterator would throw ConcurrentModificationException 
 *    if HashSet has been modified after creation of iterator, by any means except iterator’s own remove method.
 * 
 * 
 * 
 * # How to iterate HeshSet?
 * 
 * There are following two ways to iterate through HashSet:
 * 1 Using Iterator
 * 2 Without using Iterator
 * 
 * # HashSet vs HashMap
 * 
 * # HashSet vs TreeSet
 * 
 */

public class HashSetExample {

	public static void main(String[] args) {

		
		
		
		
		
		HashSet <String> hSet = new HashSet<String>();
		
		// boolean add(Element  e): It adds the element e to the list.
		
		hSet.add("apple");
		hSet.add("mango");
		hSet.add("orange");
		hSet.add("banana");
		
		
		//displaying hash set elements
		
		System.out.println(hSet);
		System.out.println(" ");
		
		// adding duplicate elements
		
		hSet.add("pineapple");
		hSet.add("apple");
		hSet.add("orange");
		
		System.out.println(hSet);
		System.out.println(" ");
		
		// adding null values
		
		hSet.add(null);
		hSet.add(null);
		
		System.out.println(hSet);
		System.out.println(" ");
		
		
		// Object clone(): This method returns a shallow copy of the HashSet.
		
		hSet.clone();
				
		System.out.println(hSet);
		System.out.println(" ");
		
		
		// int size(): It gives the number of elements of a Set.
		
		int size = hSet.size();
		System.out.println(size);
		System.out.println(" ");
		
		
		// boolean isEmpty(): Returns true if there is no element present in the Set.
		
		
		System.out.println(hSet.isEmpty());
		System.out.println(" ");
		
		// boolean contains(Object o): It checks whether the specified Object o is present in the list or not. 
		//If the object has been found it returns true else false.
		
		
		System.out.println(hSet.contains("orange"));
		System.out.println(" ");
		
		
		// remove(Object o): It removes the specified Object o from the Set.
		
		hSet.remove("orange");
		
		System.out.println(hSet);
		System.out.println(" ");
		
		// check orange is there or not
		
		System.out.println(hSet.contains("orange"));
		System.out.println(" ");
		
		
		
		int sizeN = hSet.size();
		System.out.println(sizeN);
		System.out.println(" ");
		
		
		// Using iterator HashSet
		
		Iterator<String> it = hSet.iterator();
		while(it.hasNext()) {
				System.out.println(it.next());
				
			}
		System.out.println(" ");
		
		// iterate without using Iterator
		
		for (String ele : hSet) {
			System.out.println(ele);
		}
		
		
		
		// void clear(): It removes all the elements from the list.
		
		hSet.clear();
		
		System.out.println(hSet);
		System.out.println(" ");
		
		
		// 
		
		
		System.out.println(hSet.isEmpty());
		System.out.println(" ");
		
		
		
		
		
		

	}

}
