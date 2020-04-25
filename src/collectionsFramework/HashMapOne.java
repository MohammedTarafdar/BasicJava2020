package collectionsFramework;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapOne {

	public static void main(String[] args) {
		// Most Important
		/*
		 * HashMap is a class implements Map Interface
		 * extends AbstractMap
		 */

		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(001, "Sohel");
		hm.put(002, "Yusuf");
		hm.put(003, "Aber");
		hm.put(004, "Ashraf");
		hm.put(005, "Talha");
		
		
		
		
		System.out.println(hm);
		System.out.println(" ");
		
		// To fetch value with .get()
		System.out.println(hm.get(005));
		System.out.println("");
		
		
		// To iterate, using for loop
		
		for(Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(" ");
		
		System.out.println(hm);
		System.out.println(" ");
		
		// To remove
		hm.remove(004);
		
		System.out.println(hm);
		System.out.println(" ");
		
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		
		//create object of Employee Class
		Employee e1 = new Employee("MD", "Rahman", 10112, 35);
		Employee e2 = new Employee("Abul", "Basher", 10102, 32);
		Employee e3 = new Employee("MD", "Islam", 10117, 45);
		Employee e4 = new Employee("MD", "Ahmed", 10115, 55);
		
		// To add HashMap
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);
		
		// To traverse the HashMap
		
		for(Entry<Integer,Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee "+key+" Info");
			
			System.out.println(e.firstName +" "+e.lastName+" "+e.empID+" "+e.age);
			System.out.println(" ");
		}
				
		
		
		
		
		
		
		
	}

}
