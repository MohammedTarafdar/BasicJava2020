package JavaBasic;

public class MainMethodOverloading {
	
	// Can you overload main method in Java?

	public static void main(String[] args) {
		
		System.out.println("one");
		
		MainMethodOverloading.main(1);
		MainMethodOverloading.main(1, 2);
		
		MainMethodOverloading.print();
		MainMethodOverloading.print("Yusuf");

	}
	
	public static void main(int num1) {
		
		System.out.println("Two");

	}

	public static void main(int num1, int num2 ) {
	
	System.out.println("Three");

	}
	
	static void print() {
		System.out.println("first print method");
	}

	
	static void print(String name) {
		System.out.println("second print method");
	}
}
