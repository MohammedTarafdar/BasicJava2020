
package JavaBasic;

public class ConditionalStatements {
	
	// What is dead code?
	
	// difference b/w class level variable vs local variable
	
	// </  /> <=/ >=/  ==/  !=/
	
	public static void main(String[] args) {
		
		// Concept of if statement and if else statement
		int a = 10;
		int b = 20;
		
		if(b>a){
			System.out.println("b is greater then a");
		}
		
		
		//
		
		int c = 30;
		int d = 20;
		
		if(d>c){
			System.out.println("d is greater then c");
		}
		else {
			System.out.println("c is grater then d");
		}
		
		
		//
		
		int e = 10;
		int f = 20;
		
		if(e==f){
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		//
		
		int i = 100;
		int j = 20;
		
		if(i>=j){
			System.out.println("i is greater then or equal j");
		}
		else {
			System.out.println("i is less then j");
		}
		
		// Example of dead code
		
		
		/* if(true){
			System.out.println("i is greater then or equal j");
		}
		else {
			System.out.println("i is less then j");
		} */
		
		
		// Concept of nested if statement
		
		int num =12;
		
		if(num <= 15) {
			
			if(num >= 10) {
				System.out.println("You have good score");
			}
			
			
			else {
				System.out.println("Sorry Your sco,b    re is not satisfactory");
			}
		}
		else {
			System.out.println("Sorry something wrong");
		}
		
		// Concept of if else if ladder statement
		
		
		int num1 = 22;
		
		if(num1==10) {
			System.out.println("Value of num1 is 10");
		}
		else if(num1==11) {
			System.out.println("Value of num1 is 11");
		}
		else if(num1==12) {
			System.out.println("Value of num1 is 12");
		}
		else if(num1==13) {
			System.out.println("Value of num1 is 13");
		}
		else if(num1==14) {
			System.out.println("Value of num1 is 14");
		}
		else if(num1==15) {
			System.out.println("Value of num1 is 15");
		}
		
		else {
			System.out.println("Value of num1 does " +num1 +" not match");
		}
		
		
		
		
		// How to find out the height number where three numbers are given?
		
		
		int x = 500;
		int y = 400;
		int z = 300;
		
		
		if(x>y && x>z) {
			System.out.println("X is the height number");
		}
		else if(y>z) {
			System.out.println("Y is the height number");
		}
		else {
			System.out.println("Z is the height number");
		}
		
		
		int billTotal = 500;
		int finalBill = 0;
		
		if(billTotal>=500) {
			finalBill = billTotal+10;
		}
		else if (billTotal>=300 && billTotal <500) {
			finalBill = billTotal+15;
		}
		else if (billTotal >= 200 && billTotal <300) {
			finalBill = billTotal +20;
		}
		else if (billTotal>=100 && billTotal <200){
			finalBill = billTotal+30;
		}
		else {
			finalBill = billTotal+50;
		}
		System.out.println("Final Bill : "+ finalBill);
		
		
		
		
		
	}

}

