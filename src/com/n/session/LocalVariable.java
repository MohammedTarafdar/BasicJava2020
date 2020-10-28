package com.n.session;

public class LocalVariable {
	
	/*These variables are declared inside method of the class.
    Their scope is limited to the method which means that You can’t change
    their values and access them outside of the method.
    */
    public String FirstName="Mohammed";     //instance variable

    public void methodOne(){
        String middleName="Ashikur Rahman";     // local variable
        System.out.println(middleName);
    }

    public void methodTwo(){
        String lastName="Tarafdat";     // local variable
        System.out.println(lastName);

    }

    public static void main (String arg []){

        // creating an object
        LocalVariable lVariable= new LocalVariable();

        System.out.println(lVariable.FirstName);
        lVariable.methodOne();
        lVariable.methodTwo();

    }

}
