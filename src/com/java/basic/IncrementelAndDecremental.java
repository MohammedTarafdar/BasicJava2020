package com.java.basic;

public class IncrementelAndDecremental {

	public static void main(String[] args) {
		
		// Increment Operator ++
		// Decrement Operator --
		// difference between i++ and ++i ?
		
		
		int a = 1;
		a = a+1;
		System.out.println(a);
		System.out.println("");
		
		a ++;
		System.out.println(a);
		System.out.println("");
		
		a --;
		System.out.println(a);
		System.out.println("");
		
		int i = 1;
		int j = ++i;		// Pre increment
		System.out.println(i);		// 2
		System.out.println(j);		// 2
		System.out.println("");
		
		int m = 1;
		int n = m++;	// m=1+1=2	// Post-increment
						// n=m //n=1
		System.out.println("Value of m is: "+m);		// 2
		System.out.println("Value of n is: "+n);		// 1
		System.out.println("");
		
		int p = 5;
		int q = --p;		// Pre-decrement
		System.out.println(p);		// 4
		System.out.println(q);		// 4
		System.out.println("");
		
		int x = 3;
		int y = x++;		// Post-decrement
		System.out.println(x);		// 4
		System.out.println(y);		// 3
		System.out.println("");
		
		int f = -1;
		int g = f--;		// Post-decrement
		System.out.println(f);		//-2
		System.out.println(g);		//-1
		System.out.println("");
		
		int c = -1;
		int d = --c;		// Pre-decrement
		System.out.println(c);		// -2
		System.out.println(d);		// -2
		System.out.println("");
		
		
		
		

	}

}
