package JavaBasic;

public class LoopsConcept {

	public static void main(String[] args) {
		
		// How to print 1 to 10
		
		// i++; vs ++i; vs i=i+1;
		
		// 1. while loop
		
		int i =1;					// initialization
		while(i <=10) {				// conditional
			System.out.println(i);
			//i++;
			//++i;
			
			if(i==5) {
				System.out.println("Thanks everyone else to join our program");
				break;
			}
			
			i=i+1;					// incremental/decremental
		
		}
		
		boolean flag = true;
		while(flag) {
			System.out.println("Hello guys");
			System.out.println("your total bill"+ 500);
			
			flag = false;
		}
		
		// how to print 10 to 1
		
		int p =10;
		while(p>=1) {
			System.out.println(p);
			//p=p--;
			--p;
			
		}
		
		// 2 for loop

		// How to print 1 to 10
		
		System.out.println("Print 1 to 10 with the help of for loop :");
		for(int k=1; k<=10; k++) {
			System.out.println(k);
			
			if(k==5) {
				System.out.println("You guys are under waiting list:");
			}	
			
		}
		
		// how to print even number from 0 to 9
		
		System.out.println("Print even number with the help of for loop");
		for(int even=0; even <=9; even=even+2) {
			System.out.println(even);
		}
		
		// how to print odd number from 0 to 9
		
		System.out.println("Print odd number with the help of for loop");
		for(int odd=1; odd<=9; odd=odd+2) {
			System.out.println(odd);
		}
		
		
		// do while
		
		System.out.println("Print 1 to 10 with the help of do while loop");
		int m =1;
		do {
			System.out.println(m);
			m++;
		}
		while(m<=10);
		
		
		
		
		
	}

}
