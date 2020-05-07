package JavaBasic;

public class MethodOverloadingConcept {
	

	public static void main(String[] args) {

		MethodOverloadingConcept obj = new MethodOverloadingConcept();
		obj.login("test@gmail.com", "test1234");

	}
	
	public void login() {
		System.out.println("login 0 param method");
	}
	
	public void login(String userName) {
		System.out.println("login 1 param method");
	}
	
	/*public void login(String password) {				// duplicate method
		System.out.println("login 1 param method");
	}*/
	
	public void login(String userName, String password) {
		System.out.println("login 2 param method");
	}
	
	public void login(int phone, String password) {
		System.out.println("login 0 param method");
	}
	
	public void login(int phone) {
		System.out.println("login 0 param method");
	}
	

}
