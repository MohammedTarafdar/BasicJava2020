package JavaBasic;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// 
		
		
		int num =8;
		
		switch (num) {
		case 0:
			System.out.println("The value of num is zero !!!");
			break;
			
		case 1:
			System.out.println("The value of num is one !!!");
			break;
			
		case 2:
			System.out.println("The value of num is two !!!");
			break;
			
		case 3:
			System.out.println("The value of num is three !!!");
			break;
			
		case 4:
			System.out.println("The value of num is four !!!");
			break;
			
		case 5:
			System.out.println("The value of num is five !!!");
			break;
			
			
		default:
			System.out.println("Sorry !!! Your number is not found");
			break;
		}
		
		
		// Find your day
		
		int day = 8;
		String dayValue = null;
		
		switch (day) {
		case 1:
			dayValue = "Monday";
			break;
			
		
		case 2:
			dayValue = "Tuesday";
			break;
			
		
		case 3:
			dayValue = "Wednessday";
			break;

		
		case 4:
			dayValue = "Thursday";
			break;
				
		
		case 5:
			dayValue = "Friday";
			break;
				
		
		case 6:
			dayValue = "Saturday";
			break;
			
		
		case 7:
			dayValue = "Sunday";
			break;
			
			
		default:
			System.out.println("Please use valid number ");
			break;
		}
		System.out.println("Today is : "+dayValue);
		

		
		
		// Use for Selenium
		
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome .......");
			break;
			
		case "firefox":
			System.out.println("Launch chrome .......");
			break;
			
		case "ie":
			System.out.println("Launch chrome .......");
			break;
			
		case "safari":
			System.out.println("Launch chrome .......");
			break;
			
		case "opera":
			System.out.println("Launch chrome .......");
			break;
			
		case "headless":
			System.out.println("Launch chrome .......");
			break;

		default:
			System.out.println("Please correct browser name");
			break;
		}
		
		
		// multiple case without break statement
		// can we use blank case
		
		int x = 1;
		
		switch (x) {
		case 0:
		case 1:
		case 2:
			System.out.println("Hello");
		case 3:
		case 4:
			System.out.println("friend");
			break;

		default:
			break;
		}
		
		
		
		
		
		
	}

}
