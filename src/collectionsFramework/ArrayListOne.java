package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOne {

	public static void main(String[] args) {
		
		// int array[] = new int[5];	// static array, size is fixed
		
		// dynamic array is ArrayList
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		ar1.add(40);
		
		System.out.println("The size of ArrayList is : "+ar1.size());
		System.out.println("ArrayList : "+ar1);
		System.out.println("");
		
		ar1.add(50);
		ar1.add(60);
		ar1.add(70);
		
		System.out.println("The size of ArrayList is : "+ar1.size());
		System.out.println("ArrayList : "+ar1);
		System.out.println("");
		
		ar1.add(50);
		ar1.add(10);
		
		System.out.println("The size of ArrayList is : "+ar1.size());
		System.out.println("ArrayList : "+ar1);
		System.out.println(""); 
		
		System.out.println("The fourth value of ArrayList is : "+ar1.get(3));
		System.out.println("");
		
		// To print all value sequentially from ArrayList :
		// 1. for loop
		// 2. using iterator
		
		for(int i=0; i<ar1.size(); i++){
			System.out.println("Value of ArrayList : "+ar1.get(i));		
		}
		
		// non generic vs generic
		
		
		//ar1.add(40.55);
		//ar1.add("Test");
		//ar1.add("A");
		
		System.out.println("");
		System.out.println("ArrayList : "+ar1);
		
		
		// Generic ArrayList
		
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(100);
		ar2.add(300);
		// ar.add(Test); 
		
		System.out.println("");
		System.out.println("New Generic ArrayList : "+ar2);
		System.out.println("");
		
		
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Selenium");
		ar3.add("Test");
		System.out.println("New Generic ArrayList : "+ar3);
		
		
		
		// Object of Employee Class
		
		Employee em1 = new Employee("Abu", "Talha", 10101 ,34);
		Employee em2 = new Employee("Md", "Rahman", 10111 ,37);
		Employee em3 = new Employee("Ashraful", "Islam", 10121 ,23);
		Employee em4 = new Employee("Yusuf", "Ahmed", 10115 ,45);
		
		// create ArrayList
		
		ArrayList<Employee> ar4 =new ArrayList<Employee>();
		ar4.add(em1);
		ar4.add(em2);
		ar4.add(em3);
		ar4.add(em4);
		
		// To fetch use iterator
		
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp =it.next();
			System.out.println(emp.firstName);
			System.out.println(emp.lastName);
			System.out.println(emp.empID);
			System.out.println(emp.age);
		}
		
		
		
		
		// use of .addAll() method
		
		ArrayList<String> ar5 = new ArrayList<String>();
		
		ar5.add("Test");
		ar5.add("Automation");
		ar5.add("Java");
		
		System.out.println("");
		System.out.println("ArrayList ar3 is :" +ar3);
		
		System.out.println("");
		System.out.println("ArrayList ar5 is :" +ar5);
		
		ar3.addAll(ar5);		// .addAll method added all the elements of ar5 to ar3
		
		System.out.println("");
		System.out.println("ArrayList ar3 is :" +ar3);
		
		// .removeAll
		
		ar3.removeAll(ar5);		// .removeAll method remove all the elements of ar5 from ar3
		
		System.out.println("");
		System.out.println("ArrayList ar3 after remove :" +ar3);
		
		// .retainAll() method
		
		ar3.retainAll(ar5);
		
		System.out.println("");
		System.out.println("ArrayList ar3 for common element/s :" +ar3);
		System.out.println("");
		
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Selenium");
		ar6.add("Automation");
		ar6.add("Test");
		
		System.out.println("New Generic ArrayList : "+ar6);
		System.out.println("");
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Selenium");
		ar7.add("Test");
		System.out.println("New Generic ArrayList : "+ar7);
		
		
		ar6.retainAll(ar7);
		
		System.out.println("");
		System.out.println("ArrayList ar6 for common element/s :" +ar6);
		System.out.println("");
		
		
		ar7.retainAll(ar6);
		
		System.out.println("");
		System.out.println("ArrayList ar7 for common element/s :" +ar7);
		System.out.println("");
		
		

	}

}
