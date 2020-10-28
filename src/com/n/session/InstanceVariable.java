package com.n.session;

public class InstanceVariable {

	String name="Md A R Tarafdar";


	    public static void main(String arg []){

	        InstanceVariable objOne = new InstanceVariable();
	        InstanceVariable objTwo = new InstanceVariable();
	        InstanceVariable objThree = new InstanceVariable();

	        System.out.println(objOne.name);
	        System.out.println(objTwo.name);
	        System.out.println(objThree.name);
	        System.out.println("");

	        objTwo.name="Md. Ashikur Rahman Tarafdar";

	        System.out.println(objOne.name);
	        System.out.println(objTwo.name);
	        System.out.println(objThree.name);
	        System.out.println("");

	        objTwo.name ="Ashikur Rahman";
	        objThree.name="Mohammed A R Tarafdar";

	        System.out.println(objOne.name);
	        System.out.println(objTwo.name);
	        System.out.println(objThree.name);

	}

}
