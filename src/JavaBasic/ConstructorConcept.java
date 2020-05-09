package JavaBasic;

public class ConstructorConcept {
	
	String firstName;
	String lastName;
	int ID;
	String dep;
	
	static String company = "Google";
	
	public ConstructorConcept() {
		System.out.println("zero parameter/ default constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("One parameter constructor with " + i);
	}
	
	public ConstructorConcept(String s) {
		System.out.println("One parameter constructor with " + s);
	}
	
	// Create parameterized constructor with class variable: is used to initialize class variable
	
	public ConstructorConcept(String firstName, String lastName, int ID, String dep) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
		this.dep = dep;
	}
	
	
	// We can create constructor with the help of IDE
	// rightClick > source > generate constructor for using fields
	
	public ConstructorConcept(String firstName, String lastName, int iD) {
		this.firstName = firstName;
		this.lastName = lastName;
		ID = iD;
	}

	public ConstructorConcept(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	

	public static void main(String[] args) {
		
		// one way 

		ConstructorConcept emp1 = new ConstructorConcept();
		emp1.firstName = "Yusuf";
		emp1.lastName = "Ahmed";
		emp1.ID = 10132;
		emp1.dep = "QA";
		
		System.out.println(emp1.firstName+" "+emp1.lastName+" "+emp1.ID+" "+emp1.dep);
		
		
		
		ConstructorConcept emp2 = new ConstructorConcept();
		
		ConstructorConcept emp3 = new ConstructorConcept(1);
		
		ConstructorConcept emp4 = new ConstructorConcept("One");
		
		ConstructorConcept emp5 = new ConstructorConcept("Aber", "Yusuf", 10130, "QA");
		ConstructorConcept emp6 = new ConstructorConcept("Md", "Ahmed", 10133, "QA");
		ConstructorConcept emp7 = new ConstructorConcept("Md", "Rahman", 10135, "QA");
		ConstructorConcept emp8 = new ConstructorConcept("Yusuf", "Ahmed", 10140, "QA");
		
		
		System.out.println(emp5.firstName+" "+emp5.lastName+" "+emp5.ID+" "+emp5.dep);
		System.out.println(emp6.firstName+" "+emp6.lastName+" "+emp6.ID+" "+emp6.dep);
		System.out.println(emp7.firstName+" "+emp7.lastName+" "+emp7.ID+" "+emp7.dep);
		System.out.println(emp8.firstName+" "+emp8.lastName+" "+emp8.ID+" "+emp8.dep);
		
		System.out.println(ConstructorConcept.company);
		

	}

	
	
	
}



 
 
 