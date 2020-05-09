package inheritanceConcept;

public class TestCar {

	public static void main(String[] args) {

		// child can get all the property of parent
		BMW bmw = new BMW();
		bmw.start();
		bmw.stop();
		bmw.fillFuel();
		bmw.autoParking();
		
		
		// parent can not get any property fron child
		Car car = new Car();
		car.start();
		car.stop();
		car.fillFuel();
		
		// What is top casting?
		// child class object can be referred by parent class reference variable
		Car car1 = new BMW();
		car1.start(); 	// from BMW
		car1.stop();
		car1.fillFuel();
		
		// down casting
		
		BMW bmw1 =(BMW) new Car();
		bmw1.start();
		
		

	}

}
