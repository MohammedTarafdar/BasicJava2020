package JavaBasic;

public class StaticNonStaticCarConcept {
	
	String name;
	int price;
	String color;
	static int wheels = 4;

	public static void main(String[] args) {
		
		StaticNonStaticCarConcept car = new StaticNonStaticCarConcept();
		car.name = "Audi";
		car.price = 40000;
		car.color = "Black";
		//car.wheels = 6;		// Static variable use static way
		
		System.out.println(car.name);
		//System.out.println(car.wheels);
		System.out.println(wheels);
		
		StaticNonStaticCarConcept car1 = new StaticNonStaticCarConcept();
		car1.name = "BMW";
		
		System.out.println(car1.name);
		//System.out.println(car1.wheels);
		System.out.println(wheels);
		


	}

}
