package javaWithBeginnersBook;

public class IfElseLadderExample {

	public static void main(String[] args) {

		int amount = 785;
		amount = 3450;
		amount = 450;
		
		if(amount >= 500 && amount <1000) {
			System.out.println("Congratulations you saved $50.00 delivery charge");
		}
		else if(amount >=1000 && amount <2000) {
			System.out.println("Congratulations you are elesable for 2% store gift card");
		} 
		else if(amount >=2000 && amount <3000) {
			System.out.println("Congratulations you are elesable for 4% store gift card");
		}
		else if(amount >=3000) {
			System.out.println("Congratulations you are elesable for 2% visa  or 5% store gift card");
		}
		else {
			System.out.println("Sorry you need to pay $50.00 delivery charge");
		}

	}

}
