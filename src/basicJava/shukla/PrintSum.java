package basicJava.shukla;

public class PrintSum {
	
	int i1;
	int i2;
	int total;
	
	public void giveSum() {
		total = i1+i2;	
	}

	public static void main(String[] args) {
		int num1 = 74;
		int num2 = 36;
		
		int sum = num1 + num2;
		
		System.out.println(sum);
		
		PrintSum printSum = new PrintSum();
		
		printSum.i1 = 74;
		printSum.i2 = 36;
		
		printSum.giveSum();
		
		System.out.println(printSum.total);
		
		

	}

}
