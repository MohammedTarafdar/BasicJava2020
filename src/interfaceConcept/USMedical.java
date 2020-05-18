package interfaceConcept;

public interface USMedical extends WHO {
	
	int min_fee = 10;
	
	public void physioServices();
	
	public void oncologyServices();
	
	public void orthopedicServices();

	/* Characteristic of Interface:
	 * 
	 * 1. you can not create an object of an interface
	 * 2. you can not create static prototype method in interface
	 * 3. only method declaration
	 * 4. But variables of interface are static and final by default
	 * 
	 */
	
	
	// Can we have static method with body?  => Yes
	
	// can you override this static method?  => No
	
	public static void service911() {
		System.out.println("In US call 911 for emergency service");
	}
	
	
	// What is default method?
	// can you override this default method?  => No
	
	
	default void internship() {
		System.out.println("At list 20 paid internship facility have to have");
	}
	
	
	
	
}
