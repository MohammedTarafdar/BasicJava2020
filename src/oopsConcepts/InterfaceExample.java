package oopsConcepts;

/* # What is an interface in java?
 * 
 * 
 * # What is the use of interface in Java?
 * 
 * 
 * 
 * 
 * 
 * 
 * # The multiple inheritance problem can occur, when we have two interfaces with the default methods of same signature?
 * 
 * => Duplicate default methods named concreteMethodOne with the parameters () and () are inherited 
 * from the types InterfaceExampleTwo and InterfaceExample
 */

public interface InterfaceExample {
	
	
	public void method1();
	
	public void method2();
	
	default void concreteMethodOne() {
		
		System.out.println("I am default method one from InterfaceExampl");
	}
	
	
	default void concreteMethodTwo() {
		
		System.out.println("I am default method twe from InterfaceExampl");
	}
	
	
	

}
