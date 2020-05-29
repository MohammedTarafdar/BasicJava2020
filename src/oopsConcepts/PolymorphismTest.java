package oopsConcepts;

public class PolymorphismTest extends PolymorphismExample {
	
	// Overloaded method
	
	public void testRun(int e) {
		
		System.out.println("I am basic car");
		
	}
	
	public void testRun(int e, String c) {
		
		System.out.println("I am basic car and red color");
		
	}

	public void testRun(String c, int e) {
	
		System.out.println("Hello !!! I am sports car");
		
	}
	
	// Overridden method
	
	@Override
	public void engine() {
		
		System.out.println("I am toyota class engine");
	}
	
	@Override
	public void autoEngine() {
		
		System.out.println("I am toyota class automatic engine");
		
	}
	
	

	public static void main(String[] args) {

			
			
			/*PolymorphismExample poly1 = new PolymorphismExample();
			poly1.engine();
			poly1.autoEngine();
			
			
			PolymorphismTest poly2 = new PolymorphismTest();
			
			poly2.engine();
			poly2.autoEngine();
			//poly2.testRun(4);
			//poly2.testRun(4, "red");
			//poly2.testRun("red", 6);
			//poly2.autoEngine();*/
			
			
			PolymorphismExample poly3 = new PolymorphismExample();
			poly3.engine();
			
			
			
			PolymorphismExample poly4 = new PolymorphismTest();
			poly4.engine();
			
			
		
			
			
			PolymorphismTest poly5 = new PolymorphismTest();
			poly5.engine();
			
			
			PolymorphismTest poly6 = (PolymorphismTest)new PolymorphismExample();
			poly6.autoEngine();
		
			
		}
		

	

}
