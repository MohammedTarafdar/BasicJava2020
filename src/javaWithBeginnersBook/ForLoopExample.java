package javaWithBeginnersBook;

public class ForLoopExample {

	public static void main(String[] args) {

		
		
		// How to print 1 to 10
		
		System.out.println("Print 1 to 10 ascending order");
		for(int i = 1; i <= 10; i++) {
			System.out.println("The value of i is : "+i);
			
		}
		
		// How to print 10 to 1
		
		System.out.println("");
		System.out.println("Print 1 to 10 descending order");
		
		for(int j=10; j>=1; j--) {
			System.out.println("The value of j is : "+j);
		}
		
		
		int array[] = {10, 15, 20, 30, 50};
		
		for(int i=0; i<array.length; i++) {
			System.out.println("value of array : "+array[i]);
		}
		

	}

}
