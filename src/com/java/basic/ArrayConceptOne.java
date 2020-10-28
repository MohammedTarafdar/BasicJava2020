package com.java.basic;

public class ArrayConceptOne {
	
	
	
	String sName1 = "Raz Bhai";
	static String sName2 = "Kartick Bhai";

	public static void main(String[] args) {
		
		ArrayConceptNew acn = new ArrayConceptNew();
		acn.print();
		

		// as of 01/10/2020
		
		int[] num = new int[10];
		num[0] = 10;
		num[1] = 15;
		num[2] = 55;
		
		System.out.println(num[1]);
		System.out.println(" ");
		
		for(int i=0; i<num.length; i++) {
			System.out.println("Number as of 01/10/20 = "+num[i]);
		}
		System.out.println("");
		
		// As of 01/15/20
		
		num[3] = 25;
		num[4] = 45;
		
		for(int j=0; j<num.length; j++) {
		System.out.println("Number as of 01/15/20 = "+num[j]);
		
		}
		
		
		String staticName = ArrayConceptOne.sName2;
		System.out.println(staticName);
		//System.out.println(ArrayConceptOne.sName2);
		
		

	}
	

}

class ArrayConceptNew{
	
	int [] newArray = {10,25,35,40,20};
	
	public void print() {
		for(int k=0; k<newArray.length; k++) {
		System.out.println(newArray[k]);
		}
	}
	
}
