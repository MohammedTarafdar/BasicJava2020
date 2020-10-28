package basicJava.shukla;

public class OperatorsExample {
	
	int num1;
	int num2;
	int num3;
	
	int result;
	int d;
	
	public void sum() {
		result= num1+num2*num3;
	}
	
	public void getDivision() {
		
	}
	

	public static void main(String[] args) {
		OperatorsExample example = new OperatorsExample();
		
		example.num1= -5;
		example.num2= 8;
		example.num3= 6;
		
		example.sum();
		
		System.out.println(example.result);
		
		
		
		

	}

}
