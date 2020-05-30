package oopsConcepts;

/* # What is an interface in java?
 * 
 * 
 * # What is the use of interface in Java?
 * 
 */

public interface InterfaceExample {
	
	
	public void method1();
	
	public void method2();
	
	default void concreteMethodOne() {
		
		System.out.println("I am default method one");
	}
	
	
	default void concreteMethodTwo() {
		
		System.out.println("I am default method twe");
	}
	
	
	

}
