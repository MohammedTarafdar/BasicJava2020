package javaWithTelusko;

public class ExceptionHandling {
	
	/* Throwable
	 * 		- Exception
	 * 			- Checked like:
	 * 				- IOException
	 * 				- SQLException
	 * 			
	 * 			- Unchecked
	 * 				- RuntimeException
	 * 					- ArithmeticException
	 * 					-
	 * 					-
	 * 
	 * 		- Error
	 */
	
	
	public static void main(String[] args) {
		
		/* normal statement		like: i and j
		 * critical statement	like: k
		 */
		
		int i, j, k=0;
		
		
		i = 8;
		j = 0;		// if i write 0 instead of 2, JVM will throw an ArithmeticException
		
		try {
		k = i/j;
		
		}
		catch(Exception e){
			System.out.println("Can not divided by Zero " + e);
			
		}
		
		System.out.println(k);
		
	}

}
