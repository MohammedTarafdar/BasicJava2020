package abstractConcept;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("constructor of Login Page");
	}

	@Override
	public void title() {
		System.out.println("Login Page");
		
	}

	@Override
	public void url() {
		System.out.println("http://google.com");
		
	}

	@Override
	public void footerLink() {
		System.out.println("privacy policy");
		
	}
	
	/* @Override
	public void logo() {
		System.out.println("Login Page logo");
	} */
	
	public void doLogin() {
		System.out.println("Login to page");
	}
	
	

}
