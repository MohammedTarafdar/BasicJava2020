package javaBasic;

public class StaticNonStaticConcept {
	
	String name;
	static int age = 40;

	public static void main(String[] args) {

		// 1. How to call static data members: variables and methods
		// => no need to create the object 
		// 		a. call them directly
		
		getStart();
		System.out.println(age);
		
		// 		b. call them by class name:
		
		StaticNonStaticConcept.getStart();
		System.out.println(StaticNonStaticConcept.age);
		
		
		// 2. how to call non static data members: variables and methods
		// => you have to create an object
		
		StaticNonStaticConcept obj = new StaticNonStaticConcept();
		
		System.out.println(obj.name);
		obj.name = "Talha";
		System.out.println(obj.name);
		
		obj.getName();
		
		
		// Question1 : Can i access static variables and methods by object
		
		obj.getStart();
		System.out.println(obj.name);
		
		// we can but how and why?
		
		
		// can I create the object without any reference?
		
		// => yes 
		
		new StaticNonStaticConcept(); 
		
		
		// obj=null;  => What does mean?
		
		StaticNonStaticConcept obj1 = new StaticNonStaticConcept();
		StaticNonStaticConcept obj2 = new StaticNonStaticConcept();
		StaticNonStaticConcept obj3 = new StaticNonStaticConcept();
		
		obj1.name = "Yusuf";
		System.out.println(obj1.name);
		
		obj2.name = "Ashraf";
		System.out.println(obj2.name);
		
		//obj2=null;
		
		obj2.name = "Ashraf";
		System.out.println(obj2.name);
		
		
		obj3.name = "Aber";
		System.out.println(obj3.name);
		
		
		
		
		
		
		
		
		

	}
	
	
	public void getName() {
		System.out.println("get name");
	}
	
	public static void getStart() {
		System.out.println("get start");
	}
	
	

}
