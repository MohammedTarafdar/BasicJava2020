package inheritanceConcept;

	// parent child relation ship

public class BMW extends Car{
	
	/* 
	 * when we have a method in parent class as well as in child class with the same name and same number of parameter it's called
	 *method overriding
	 */ 
	 
	 
	@Override
	public void start() {
		System.out.println("BMW auto start");
	}
	
	public void autoParking() {
		System.out.println("BMW auto parking");
	}

}
