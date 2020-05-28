package oopsConcepts;

public class ClassExampleOne {
	
	// instance variable or fields
	
	String webName;
	int webAge;
	
	// constructor
	
	ClassExampleOne(String name, int age){
		this.webName = name;
		this.webAge = age;
	}

	public static void main(String[] args) {    
 
		
		ClassExampleOne obj1 = new ClassExampleOne("google.com", 20);
		ClassExampleOne obj2 = new ClassExampleOne("BeginnersBook.com", 5);
		
		
		//Accessing object and data through reference
		
		System.out.println("Website name is "+obj1.webName+" and it's created almost "+obj1.webAge+" years ago.");
		System.out.println("Website name is "+obj2.webName+" and it's created almost "+obj2.webAge+" years ago.");
		
		
		
		// Creating object and assigning value
		
		
		ClassExampleTwo classEx1 = new ClassExampleTwo();
		
		classEx1.stFirstName = "Abu";
		classEx1.stLastName = "Talha";
		classEx1.stID = "SSMB-23";
		
		System.out.println(classEx1.stFirstName+" "+classEx1.stLastName+" "+classEx1.stID+" "+classEx1.collegeName);
		
		// calling method with the help of object
		classEx1.studentInfo();
		
		// calling static variable
		
		System.out.println(ClassExampleTwo.collegeName);
		
		
		
				
		

	}

}



class ClassExampleTwo{
	
	
	String stFirstName;
	String stLastName;
	String stID;
	static String collegeName = "Shift Vision";
	
	public void studentInfo() {
		System.out.println("Hello i am Student information");
	}
	
	
	
	
	
}
