package com.interview.question;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//with algorithm
		
		int num = 12345;
		int revNum = 0;
		
		while(num !=0) {
			revNum = revNum*10+ num%10;
			num = num/10;
		}
		System.out.println("My reverse number is : "+revNum);
		
		long num2 = 456789;
		long revNum2 = 0;
		
		while(num2 !=0) {
			revNum2 = revNum2*10 + num2%10;
			num2 = num2/10;
		}
		System.out.println("My second reverse Number is : "+revNum2);
		
		// With the help of existing function
		
		int num3 =3456;
		
		StringBuffer stBuffer= new StringBuffer(String.valueOf(num3));
		System.out.println("My Third revers number is : "+stBuffer.reverse());
		// or
		System.out.println("My third reverse number is : "+new StringBuffer(String.valueOf(num3)).reverse());

	}

}
