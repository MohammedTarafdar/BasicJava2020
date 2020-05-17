package javaBasic;

public class RegistrationPage {
	
	
	String firstName;
	String lastName;
	long phoneNumber;
	String emailID;
	String password;
	String Address;
	String dob;
	long dlNumber;
	String gender;
	boolean ageLimit;
	int opt;
	
	// zero parameter constructor
	
	public RegistrationPage() {
		System.out.println("Hi, this is zero parameter constructor");
	}
	
	
	// constructor with all filed
	
	public RegistrationPage(String firstName, String lastName, long phoneNumber, String emailID, String password,
			String address, String dob, long dlNumber, String gender, boolean ageLimit, int opt) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailID = emailID;
		this.password = password;
		this.Address = address;
		this.dob = dob;
		this.dlNumber = dlNumber;
		this.gender = gender;
		this.ageLimit = ageLimit;
		this.opt = opt;
	}

	
	// constructor with mandatory fields

	public RegistrationPage(String firstName, String lastName, long phoneNumber, String emailID, String password,
			int opt) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailID = emailID;
		this.password = password;
		this.opt = opt;
	}
	
	
	public void doRegistration() {
		System.out.println("processing registration with: "+firstName+" "+ lastName+ " "+password);
	}

	
	public void getOTP() {
		System.out.println(opt);
	}
	
	

}
