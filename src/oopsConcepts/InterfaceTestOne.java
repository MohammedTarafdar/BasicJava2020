package oopsConcepts;

public class InterfaceTestOne implements InterfaceExample{
	
	public void method1() {
		System.out.println("I am from InterfaceExample");
	}
	
	public void method2() {
		System.out.println("I am from InterfaceExample");
	}

	public static void main(String[] args) {

		InterfaceTestOne testOne = new InterfaceTestOne();
		testOne.concreteMethodOne();
		testOne.concreteMethodTwo();
		

	}

}
