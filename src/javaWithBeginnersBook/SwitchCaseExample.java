package javaWithBeginnersBook;

public class SwitchCaseExample {
	
	public static void main(String [] arg) {
		
		// Example of switch case without break statement
		
		System.out.println("Example of switch case without break statement");
		
		int num = 3;
		//num =7;
		
		switch(num) {
		
		case 1:
			System.out.println("num = "+num);
			
		case 2:
			System.out.println("num = "+num);
			
		case 3:
			System.out.println("num = "+num);
			
		case 4:
			System.out.println("num = "+num);
			
		case 5:
			System.out.println("num = "+num);
			
		case 6:
			System.out.println("num = "+num);
			
		case 7:
			System.out.println("num = "+num);
			
		default:
			System.out.println("Default num value is = 3");
		
		
		}	
			
	
			
		// Example of switch case with break statement
		
		System.out.println("");
		System.out.println("Example of switch case with break statement");
			
		int num1 = 3;
		//num =7;
			
		switch(num1) {
			
		case 1:
			System.out.println("num = "+num);
			break;
			
		case 2:
			System.out.println("num = "+num);
			break;
			
		case 3:
			System.out.println("num = "+num);
			break;
			
		case 4:
			System.out.println("num = "+num);
			break;
			
		case 5:
			System.out.println("num = "+num);
			break;
			
		case 6:
			System.out.println("num = "+num);
			break;
			
		case 7:
			System.out.println("num = "+num);
			break;
			
		default:
			System.out.println("Default num value is = 3");
			
			
		}
		
		
		
		// check whether vowel or consonant
		
		System.out.println(" ");
		
		System.out.println("check whether vowel or consonant");
		
		
		char ch= 'a';
		//ch = 'e';
		ch = 'g';
		
		switch(ch) {
		
		case 'a':
			System.out.println("vowel");
			break;
			
		case 'e':
			System.out.println("vowel");
			break;
			
		case 'i':
			System.out.println("vowel");
			break;
			
		case 'o':
			System.out.println("vowel");
			break;
		
		case 'u':
			System.out.println("vowel");
			break;
			
		case 'A':
			System.out.println("vowel");
			break;
			
		case 'E':
			System.out.println("vowel");
			break;
			
		case 'I':
			System.out.println("vowel");
			break;
			
		case 'O':
			System.out.println("vowel");
			break;
			
		case 'U':
			System.out.println("vowel");
			break;	
			
		default:
			System.out.println("consonant");
			
			
		}
		
		
		
		
		}
	
}
		
		
	