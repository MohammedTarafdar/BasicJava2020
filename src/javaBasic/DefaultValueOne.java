package javaBasic;

public class DefaultValueOne {
	
	static int age;
	static String name;
	static char a;
	static double salary;
	static boolean available;
	
	

	public static void main(String[] args) {
		
		
		//int i;
		//System.out.println(i);	// why error?	=> local variable
		
		int i = 10;
		System.out.println(i);
		
		//String s;
		//System.out.println(s);	// why error?	=> local variable
		
		String s = "Test";
		System.out.println(s);
		
		System.out.println("Default Value of int is : "+age);
		System.out.println("Default Value of string is : "+name);
		System.out.println("Default Value of int is : "+a);
		System.out.println("Default Value of double is : "+salary);
		System.out.println("Default Value of boolean is : "+available);
		
		
		// 0/2 vs 2/0		v.v.i.q
		
		int div = 0/2;
		System.out.println(div);
		
		int div1 = 2/0;		// it will through an ArithmeticException
		System.out.println(div1);
		
		
		
		

	}

}
