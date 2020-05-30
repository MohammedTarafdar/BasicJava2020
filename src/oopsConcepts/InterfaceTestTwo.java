package oopsConcepts;

public class InterfaceTestTwo implements InterfaceExample, InterfaceExampleTwo {

	

	@Override
	public void method1() {
		System.out.println("I am from INTERFACE TEST CLASS TWO");
		
	}

	@Override
	public void method2() {
		System.out.println("I am from INTERFACE TEST CLASS TWO");
		
	}
	

	@Override
	public void newMethod() {
		System.out.println("I am from INTERFACE TEST CLASS TWO");
		
	}

	@Override
	public void oldMethod() {
		System.out.println("I am from INTERFACE TEST CLASS TWO");
		
	}
	
	
	public void print() {
		System.out.println("I am print method from INTERFACE TEST CLASS TWO");
	}
	
	@Override
	public void concreteMethodOne() {

		System.out.println("I am overeiden concrete method from Interface Example");
		InterfaceExample.super.concreteMethodOne();
	}

	public static void main(String[] args) {
		
		InterfaceExampleTwo.anotherMethed();
		System.out.println(" ");

		InterfaceTestTwo test1 = new InterfaceTestTwo();
		test1.concreteMethodOne();
		test1.concreteMethodTwo();
		test1.method1();
		test1.method2();
		test1.newMethod();
		test1.oldMethod();
		test1.print();
		//test1.
		InterfaceExampleTwo.anotherMethed();
		
		
		
		InterfaceExample test2 = new InterfaceTestTwo();
		System.out.println(" ");
		System.out.println(" ");
		
		test2.concreteMethodOne();
		test2.concreteMethodTwo();
		test2.method1();
		test2.method2();
		//test2.
		InterfaceExampleTwo.anotherMethed();
		
		
		
		InterfaceExampleTwo test3 = new InterfaceTestTwo();
		System.out.println(" ");
		System.out.println(" ");
		
		test3.newMethod();
		test3.oldMethod();
		InterfaceExampleTwo.anotherMethed();
		

	}

}
