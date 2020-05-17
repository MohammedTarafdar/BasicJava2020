package javaBasic;

public class LoginPage {

	public static void main(String[] args) {


	}
	
	public HomePage login(String un, String pwd) {
		System.out.println("UserName is "+un);
		System.out.println("Password id "+pwd);
		System.out.println("Click on login button");
		
		// How to return class object?
		
		return new HomePage();
		
		/*
		OR
		*/
		
		/* HomePage hp =new HomePage();
		return hp;
		
		// this is not a good practice
		*/
	}

}
