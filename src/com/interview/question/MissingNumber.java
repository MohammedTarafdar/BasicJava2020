package com.interview.question;

public class MissingNumber {

	public static void main(String[] args) {
		
		int numArray[] = {1,2,3,5};
		
		int sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			sum = sum+numArray[i];
		}
		System.out.println("Sum of array is : "+sum);
		
		int sum1 = 0;
		for (int j = 1; j <= 5; j++) {
			sum1 = sum1+j;
		}
		System.out.println("Sum of expected array is : "+sum1);
		
		int missingNumber = sum1 - sum;
		System.out.println("Our missing number is : "+missingNumber);
	}

}
