package javaBasic;

public class AmazonSearch {
	
	// Method Overloading concept

	public static void main(String[] args) {
		
		AmazonSearch search = new AmazonSearch();
		
		search.search("book", 20);
		

	}
	
	
	public void search(String product) {
		System.out.println("search method with 1 param");
	}
	
	public void search(String product, int price) {
		System.out.println("search method with 2 params");
	}
	
	public void search(String product, int price, String seller) {
		System.out.println("search method with 3 params");
	}
	
	public void payment(long CCNumber) {
		System.out.println("payment method with 1 param");
	}
	
	public void payment(long CCNumber, int pin) {
		System.out.println("payment method with 2 params");
	}
	
	public void payment(long CCNumber, int pin, String cardHolderName) {
		System.out.println("payment method with 3 params");
	}

}
