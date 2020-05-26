package javaWithBeginnersBook;

public class IfElseExample {

	public static void main(String[] args) {

		int orderAmount = 39;
		
		if(orderAmount >= 50) {
			System.out.println("Great you don't need to pay delivery cost");
		}
		else {
			System.out.println("Sorry you need to pay delivery cost");
		}

	}

}
