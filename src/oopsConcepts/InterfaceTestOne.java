package oopsConcepts;

public class InterfaceTestOne implements InterfaceExample{
	
	
	int num1;
	
	int num2;
	
	public void sum() {
		int sum = num1+num2;
		System.out.println("Sum of two number is : "+sum);
	}
	
	@Override
	public void method1() {
		System.out.println("I am from Interface test one CLASS");
	}
	
	@Override
	public void method2() {
		System.out.println("I am from Interface test one CLASS ");
	}
	
	

	public static void main(String[] args) {
		
		
		
		// object of interface test class

		InterfaceTestOne testOne = new InterfaceTestOne();
		testOne.num1=10;
		testOne.num2=20;
		testOne.sum();
		
		testOne.method1();
		testOne.method2();
		
		testOne.concreteMethodOne();
		testOne.concreteMethodTwo();
		
		
		// upcasting
		
		System.out.println(" ");
		System.out.println(" ");
		
		InterfaceExample testTwo = new InterfaceTestOne();
		
		testTwo.method1();
		testTwo.method2();
		testTwo.concreteMethodOne();
		testTwo.concreteMethodTwo();

	}

}
