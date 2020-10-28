package com.java.basic;

import java.util.ArrayList;

public class MethodConcept {

	public static void main(String[] args) {
		
		// create object of the class : using new keyword
		
		MethodConcept obj = new MethodConcept();
		
		obj.test();
		
		obj.print();
		
		String sName = obj.getStudentName();
		System.out.println(sName);
		
		int totalMarks = obj.sum();
		System.out.println("Total Marks of student : "+totalMarks + 10 );
		
		
		System.out.println(obj.getCapitalName("Bangladesh"));
		
		String subject[] = obj.getSubjectName();
		System.out.println("Size of array "+subject.length);
		
		for(int i=0; i<subject.length; i++) {
			System.out.println(subject[i]);
		}
		
		System.out.println(obj.addition(30, 40));
		System.out.println(obj.addition(350, 400));
		
		String cap1 = obj.getCapitalName("USA");
		System.out.println(cap1);
		
		String cap2 = obj.getCapitalName("UK");
		System.out.println(cap2);
		
		System.out.println(obj.isUSCitizen("Talha"));
		
	
	}
	
	/*	Types of methods:
	 * 		1. System define methods
	 * 		2. User define methods
	 * 			I. no input and no return
	 *  		II.
	 *  		III.
	 */
	
	// I. no input and no return
	
	//  return type: void
	public void test() {
		System.out.println("Test method");
	}
	
	//  return type: void
	public void print() {
		System.out.println("Bangladesh");
	}
	
	// 2. no input but some return:
	//  return type: String
	public String getStudentName() {
		System.out.println("Student Name");
		String name = "Yusuf";
		return name;
	}
	
	//  return type: int
	public int sum() {
		System.out.println("Sum method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	
	//  return type: String Array
	public String[] getSubjectName() {
		System.out.println("Subject Name");
		String sName[] = new String[5];
		sName[0] = "Bangla";
		sName[1] = "English";
		sName[2] = "Math";
		return sName;
			
	}
	
	//  return type: ArrayList<String>
	public ArrayList<String> getHotelList() {
		System.out.println("Hotel List");
		ArrayList<String> hotel = new ArrayList<String>();
		hotel.add("Marriot");
		hotel.add("Hayet");
		hotel.add("Sheraton New York");
		
		return hotel;
		
	}
	
	
	// III. Some input and some return:
	
	public int addition(int num1, int num2) {
		System.out.println("Addition Method");
		int sum = num1 + num2;
		return sum;
	}
	
	public String getCapitalName(String countryName) {
		System.out.println("Capital city name");
		
		if(countryName.equals("Bangladesh")) {
			return "Dhaka";
		}
		else if(countryName.equals("USA")) {
			return "Washington DC";
		}
		else if(countryName.equals("Rassia")) {
			return "Moscow";
		}
		return "Country Name not found";
		
		/*else {
			return "Country name not found";
		}*/
	}
	
	
	public Boolean isUSCitizen(String studentName) {
		
		if(studentName.equals("Talha")) {
			return true;
		}
		else if(studentName.equals("Hujayfa")) {
			return false;
		}
		else {
			return false;
		}
		
	}
	
	

}
