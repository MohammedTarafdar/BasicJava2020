package interfaceConcept;

public interface IndianMedical {
	
	public void emergencyServices();
	
	public void neuroServices();
	
	public void pediatricServices();
	
	public static void dengueService() {
		System.out.println("Emergency service provided by Indian Govt.");
	}

}
