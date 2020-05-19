package encapsulationConcept;

public class WebAutomation {
	
	
	public void launchBrowser() {
		interactWithBrowser();
	}
	
	
	private void interactWithBrowser() {
		checkBrowserCompatibility();
	}
	
	private void checkBrowserCompatibility() {
		checkBrowserVersion();
	}
	
	private void checkBrowserVersion() {
		checkBrowserWithOS();
	}
	
	private void checkBrowserWithOS() {
		System.out.println("launch the browser");
	}
	
	

}
