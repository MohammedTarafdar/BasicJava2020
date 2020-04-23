package JavaBasic;

public class DataTypes {
	
		// Single line comments
	
		/*
		* Multi-line comments
		*/

	public static void main(String[] args) {
		
		// Data types:
		
		//integer family:
		//1. byte:
			//size: 1 byte = 8 bits
			//range: -128 to 127
		
		byte b =10;
		byte b1 = -20;
		byte b2 = 123;
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("");
		
		//byte b2 = -123; Rule: Duplicate variable is not allowed in java.
		b2 = -123;
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("");
		
		
		// 2. short:
			//size: 2 bytes = 16 bits
			//range: -32768 to 32767
			
			short s = 12345;
			short s1 = -32123;
			short s2 = 1234;
			
			System.out.println("");
			System.out.println(s);
			System.out.println(s1);
			System.out.println(s2);
			
			// 3. int:
			// size: 4 bytes = 32bits
			// range: 
			
			int i = 0;
			int i1 = -123;
			int i2 = 1234557;
			
			System.out.println("");
			System.out.println(i);
			System.out.println(i1);
			System.out.println(i2);
			
			
			//long:
			// size: 8 bytes = 64 bits
			
			long l = 123456789;
			long l1 = -987654321;
			
			System.out.println("");
			System.out.println(l);
			System.out.println(l1);
			
			// double family:
			
			// 5 float:
			// size: 4 bytes= 32 bits
			
			
			float f = 12.33f;
			float f1 = (float) 67.55;
			float f2 = 100;
			
			System.out.println("");
			
			System.out.println(f);
			System.out.println(f1);
			System.out.println(f2);
			
			// 6 double
			// size: 8 bytes
			
			double d = 12.3333457;
			double d1 = 3.12345678;
			
			System.out.println(" ");
			System.out.println(d);
			System.out.println(d1);
			
			
			// 7 char:
			// size: 2 bytes
			
			char c = 'a';
			char c1 = '1';
			char c2 = 'A';
			
			System.out.println("");
			System.out.println(c);
			System.out.println(c1);
			System.out.println(c2);
			
			
			
			// 8 boolean:
			//size: 1 bit (around)
			
			boolean bl = true;
			boolean bl1 = false;
			
			System.out.println("");
			System.out.println(bl);
			System.out.println(bl1);
				
			
			String st = "Hello"; 
			String st1 = "World";

			
			System.out.println("");
			System.out.println(st);
			System.out.println(st1);

			
			// "String" What type of data is?
			// it's a class. It is non-primitive data type

	}

}
