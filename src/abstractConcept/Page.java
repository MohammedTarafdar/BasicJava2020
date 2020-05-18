package abstractConcept;

public abstract class Page {
	
	/*What is full abstraction?
	 * => Full or 100% abstraction can be achieved by Interface
	 * 
	 * What is partial abstraction?
	 * => 0 to 100% abstraction can be achieved by abstract class
	 */
	
	
	public Page() {
		System.out.println("constructor of page class");
	}

	
	public abstract void title();
	
	public abstract void url();
	
	public abstract void footerLink();
	
	public final void logo() {
		System.out.println("Page logo");
	}
	
	
	
}
