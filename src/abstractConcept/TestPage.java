package abstractConcept;

public class TestPage {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		
		lp.title();
		lp.url();
		lp.footerLink();
		lp.doLogin();
		lp.logo();
		
		
		Page page = new LoginPage();
		
		page.title();
		page.logo();
		
		//page.doLogin();
		
		/*
		 *  Can i create an object of abstract class?
		 *  => no
		 */
		
		

	}

}
