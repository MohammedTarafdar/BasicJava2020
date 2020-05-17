package javaBasic;

public class RegistrationTest {
	
	

	public static void main(String[] args) {

		
		
		RegistrationPage reg = new RegistrationPage();
		
		
		RegistrationPage regAll = new RegistrationPage("Md", "Rahman", 347337992, "rahman@gmail.com", "test1234", "22 metropolitan Ave NY", 
				"03-25-1985", 234567291, "Male", true, 9876);
		
		System.out.println(regAll.firstName+" "+regAll.lastName);
		
		
		regAll.doRegistration();
		
		regAll.getOTP();

	}
	
	

}
