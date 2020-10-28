package com.java.basic;

public class ClassConcept {
	
	// Data members of class: class variables, class methods
	
	String title;
	String url;
	String header;
	
	static String logo = "http://logo.com/logo.img";
	
	public void topPanel() {
		System.out.println("Top Panel");
	}
	
	public void leftPanel() {
		System.out.println("Left Panel");
	}
	
	public void footerLink() {
		System.out.println("Footer Link");
	}
	
	public static void privacyPolicy() {
		System.out.println("Privacy policy same for all");
	}

	public static void main(String[] args) {
		
		ClassConcept obj = new ClassConcept();
		ClassConcept obj1 = new ClassConcept();
		ClassConcept obj2 = new ClassConcept();
		
		obj.title = "LoginPage";
		obj.header = "Welcome to Login Page";
		obj.url = "http://abc.com/homePage";
		
		obj1.title = "HomePage";
		obj1.header = "Welcome to Home Page";
		obj1.url = "http://abc.com/homePage";
		
		System.out.println("Page title: "+obj.title+","+" "+"Page header:" +"obj.header"+","+" "+"Page URL: "+obj.url);
		obj.topPanel();
		obj.leftPanel();
		obj.footerLink();
		
		System.out.println(obj1.title +"  "+obj1.header+"  "+obj.url);
		
		// what will be the output ?
		// We did not assign the value so it will print default value
		
		System.out.println(obj2.header);
		
		// calling static variable and method
		
		ClassConcept.privacyPolicy();
		
		String logo =ClassConcept.logo;
		System.out.println(logo);
		
		

	}

}
