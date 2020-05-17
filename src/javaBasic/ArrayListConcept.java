package javaBasic;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// 
		
		ArrayList al = new ArrayList();
		
		al.add(100);	//0
		al.add(200);	//1
		al.add(300);	//2
		
		System.out.println("Size of ArrayList : "+al.size());
		
		al.add(400);	//3
		al.add(500);	//4
		
		System.out.println("Size of ArrayList : "+ al.size());
		
		al.add(600);	//5
		al.add(700);	//6
		
		System.out.println("Size of ArrayList : "+ al.size());
		
		System.out.println("expected value :" + al.get(4));
		al.remove(4);	//7
		System.out.println("Size of ArrayList : "+ al.size());
		
		System.out.println("expected value :" + al.get(4));
		
		System.out.println(al);
		
		for(int a=0; a<al.size(); a++) {
			System.out.println(al.get(a));
		}
		
		al.add(100.75);
		al.add("Talha");
		al.add('A');
		
		System.out.println("Size of ArrayList : "+al.size());
		System.out.println("Elements of ArrayList : "+al);
		
		// generic ArrayList
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(85);
		marks.add(91);
		marks.add(79);
		System.out.println("Elements of Integer ArrayList : "+marks);
		
		
		ArrayList<String> stName = new ArrayList<String>();
		stName.add("Talha");
		stName.add("Yusuf");
		stName.add("Ashik");
		System.out.println("Elements of String ArrayList : "+ stName);
		
		// How to store any types of data
		
		ArrayList<Object> empInfo = new ArrayList<Object>();
		empInfo.add("Abu");
		empInfo.add("Talha");
		empInfo.add(35);
		empInfo.add(75000);
		empInfo.add('M');
		
		System.out.println("Elements of Object ArrayList : "+empInfo);
		
		
		

	}

}
