package javaBasic;

public class StringConcat {

	public static void main(String[] args) {
		
		String x = "Selenium";
		String y = "Test";
		
		int a = 100;
		int b = 200;
		
		double p = 50.87;
		double q = 150.25;
		
		System.out.println(x+y);
		System.out.println(" ");
		 
		System.out.println(a+b);
		System.out.println("");
		
		System.out.println(p+q);
		System.out.println("");
		
		System.out.println(a+x);		//100Selenium
		System.out.println("");
		
		System.out.println(b+q);		//350.25
		System.out.println("");
		
		System.out.println(x+q);		//Selenium150.25
		System.out.println("");
		
		System.out.println(a+b+x);		// 300Selenium
		System.out.println("");
		
		System.out.println(a+b+y+q);		//300Test150.25
		System.out.println("");
		
		System.out.println(x+y+a);		//SeleniumTest100
		System.out.println("");
		
		System.out.println(x+y+a+b);		//SeleniumTest100200
		System.out.println("");
		
		System.out.println(x+y+(a+b));		//SeleniumTest300
		System.out.println("");
		
		System.out.println(x+y+a+b+p+q);		//SeleniumTest10020050.87150.25
		System.out.println("");
		
		System.out.println(a+b+x+y+p+q);		//300SeleniumText50.87150.25
		System.out.println("");
		
		System.out.println("The value of x is : "+x);		// The value of x is : Selenium
		System.out.println("");
		
		System.out.println("The value of y is : "+y);		// The value of  y is : Test
		System.out.println("");
		
		System.out.println("The value of a is : "+a);		// The value of a is : 100
		System.out.println("");
		
		System.out.println("The value of b is : "+b);		// The value of a is : 200
		System.out.println("");
		
		System.out.println("The value of a and b is :"+a+b);		// The value of a and b is : 100200
		System.out.println("");
		
		System.out.println("The sum of a and b is :"+(a+b));		// The sum of a and b is : 300
		System.out.println("");
		
		
		char c1 = 'a';
		char c2 = 'b';
		
		/* ascii value range
		 * a to z : 97 to 122
		 * A to Z : 65 to 90
		 * 0 to 9 : 48 to 57
		 */
		
		System.out.println(c1+c2);
		System.out.println(" ");
		
		

	}

}
