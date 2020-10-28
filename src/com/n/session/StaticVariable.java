package com.n.session;

public class StaticVariable {
	
	/*Static variables are also known as class variable because they are associated with the class
    and common for all the instances of class.
     */

    static String name= "Md A R Tarafdar";

    public static void main(String[] args) {

        System.out.println(name);
        System.out.println("");

        StaticVariable objOne = new StaticVariable();
        StaticVariable objTwo = new StaticVariable();
        StaticVariable objThree = new StaticVariable();

        System.out.println(objOne.name);
        System.out.println(objTwo.name);
        System.out.println(objThree.name);
        System.out.println("");

        objTwo.name="Mohammed A R Tarafdar";

        System.out.println(objOne.name);
        System.out.println(objTwo.name);
        System.out.println(objThree.name);
        System.out.println("");


    }

}
