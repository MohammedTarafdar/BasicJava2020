package oopsConcepts;

public class ObjectTestOne {

	public static void main(String[] args) {

		
		// creating object by using new keyword
		
		ObjectExample obj1 = new ObjectExample();
		
		
		// printing the object reference
		
		//System.out.println(obj1);
		
		
		// assign value to object example class variable
		
		obj1.print();
		
		obj1.studentID = "SSMB-24";
		
		System.out.println(obj1.studentName+", "+obj1.studentID);
		
		
		Student obj2 = new Student();
		obj2.print();

	}

}
