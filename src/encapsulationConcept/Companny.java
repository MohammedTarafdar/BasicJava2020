package encapsulationConcept;

public class Companny {
	
	/*
	 * getter and setter method
	 */
	
	
	public String name;
	public String logo;
	public int empNumber;
	private String engine;
	private int revenue;
	
	
	
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getRevenue() {
		return revenue;
	}
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	
	/*
	// By test engineer
	public void setEngine(String engine) {
		this.engine = engine;
		
	}
	
	public String getEngine() {
		return engine;
	}
	*/
	
	
	// how to create with the help of IDE
	// => right click > go to source > Generate Getters and Setters
	
	
	

}
