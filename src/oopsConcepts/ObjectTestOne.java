package oopsConcepts;

public class ObjectTestOne {
	
	/* # What is Object?
	 * 
	 * 
	 * ********************************
	 * # How to create an object in java? /or
	 * # Can you create an object without using new keyword? /or
	 * # What are the different ways to create an object in Java? ***
	 * 
	 * => There are five different way to create an object in Java :
	 * 1. using new keyword
	 * 2. using clone() method		=> No constructor get called
	 * 3. using newInstance() method of Class class
	 * 4. using newInstance() method of Constructor class
	 * 5. using deserialization		=> No Constructor get called
	 */
	
	
	

	public static void main(String[] args) {

		
		// creating object by using new keyword with the help of zero parameter constructor
		
		ObjectExample obj1 = new ObjectExample();
		obj1.print();
		
		// assign value to "ObjectExample" class variable
		obj1.studentID = "SSMB-24";
		
		System.out.println(obj1.studentName+", "+obj1.studentID);
		
		// printing the object reference
		//System.out.println(obj1);
		
		
		// creating object by using new keyword with the help of default constructor
		
		Student obj2 = new Student();
		obj2.print();

	}

}
