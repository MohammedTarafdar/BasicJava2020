package javaWithBeginnersBook;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> hMap= new HashMap<Integer, String>();
		
		hMap.put(1, "Apple");
		hMap.put(2, "Banana");
		hMap.put(3, "Orange");
		hMap.put(4, "Nut");
		
		System.out.println("Value of Hash Map = "+hMap);
		System.out.println(" ");
		
		// To get value based on key
		String secondValueString =hMap.get(2);
		System.out.println("The value of index number 2 is = "+secondValueString);
		
		System.out.println(" ");
		System.out.println("Iterate through for loop =====>");
		
		for(Map.Entry<Integer, String> me: hMap.entrySet()) {
			System.out.println("Key :"+me.getKey()+" Value :"+me.getValue());
		}
			
		
		

	}

}
