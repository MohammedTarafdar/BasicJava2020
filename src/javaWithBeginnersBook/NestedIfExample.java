package javaWithBeginnersBook;

public class NestedIfExample {

	public static void main(String[] args) {

		
		// First example
		int num = 75;
		num =45;
		
		if (num <100 ) {
			
			System.out.println("User input less then 100");
			
			if(num > 50) {
				System.out.println("But it's more then 50 ");
			}
		}
		
	
		
		// Second example 
		
		int marks = 65;
		//marks =85;
		marks = 25;
		
		if(marks >= 33) {
			if(marks <45) {
				System.out.println("you got third class marks");
			}
			
			if(marks <60) {
				System.out.println("you got second class marks");
			}
			
			if(marks <80) {
				System.out.println("you got first class marks");
			}
			
			
			if(marks >= 80 && marks <=100) {
				System.out.println("you got star marks");
			}
		}
		
		System.out.println("Sorry you need to try again");

	}

}
