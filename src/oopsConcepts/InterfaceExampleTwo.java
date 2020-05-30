package oopsConcepts;

public interface InterfaceExampleTwo {
	
	
	public void newMethod();
	
	public void oldMethod();
	
	default void concreteMethodOne() {
		
		System.out.println("I am default method one from Interface Exampl Two");
	}
	
	static void anotherMethed() {
		System.out.println("I am static method from Interface Exampl Two");
	}
	

}
