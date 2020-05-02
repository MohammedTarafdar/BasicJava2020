package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {
		// what is the lowest index in array?
		//	=> 0 is the lowest index in array
		
		// What is the height index in array?
		// 	=> HI = Length of array - 1 is the height index in array
		
		// Limitation of Array
		// 1. size is fixed
		// 2. similar (homogeneous) types of data
		
		// How to resolved similar (homogeneous) types of data issue?
		
		// 1 int array
		
		int i[] = new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		//System.out.println(i[-1]);	// ArrayIndexOutOfBoundsException
		System.out.println(i[0]);
		System.out.println(i[2]);
		System.out.println(i[4]);
		//System.out.println(i[5]);	// ArrayIndexOutOfBoundsException
		
		// How to check how many value is there?
		
		System.out.println("Length of Array is : "+i.length);
		
		// Arithmetic operation
		System.out.println(i[0]+i[2]);
		
		// To print all the values of Array using for loop
		
		System.out.println("All the values of Array :");
		for(int j=0; j<5; j++) {	
			System.out.println(i[j]);
		}
		
		// OR
		
		System.out.println("");
		System.out.println("All the values of Array :");
		for(int j=0; j<i.length; j++) {	
			System.out.println(i[j]);
		}
		
		// 2. double array
		
		double []d = new double[5];
		d[0]=12.25;
		d[1]=50;
		
		
		// 3. String array
		
		String student[] = new String[5];
		
		student[0] = "Talha";
		student[2] = "Yusuf";
		student[4] = "Ashraf";
		
		System.out.println("");
		for(int count=0; count<student.length; count++) {
			System.out.println(student[count]);
			
			/*if(student[count].equals("Yusuf")) {
				System.out.println("Yusuf got height marks");
			}*/
			
		}
		
		student[1] = "Ashik";
		student[3] = "Aber";
		
		System.out.println("");
		for(int count=0; count<student.length; count++) {
			System.out.println(student[count]);
			
			if(student[count].equals("Yusuf")) {
				System.out.println("Yusuf got height marks");
			}
			
		}
		
		String browsers[] = new String[5];
		
		browsers[0] = "chrome";
		browsers[1] = "firefox";
		browsers[2] = "ie";
		browsers[3] = "safari";
		browsers[4] = "headless";
		
		System.out.println("");
		for(int b=0; b<browsers.length; b++ ) {
			
			System.out.println(browsers[b]);
			
			if(browsers[b].equals("ie")) {
				System.out.println("Launch IE ");
			}
			
		}
		
		//int[] marks = new int[3];	//3 to 5
		int[] marks = new int[5];
		
		marks[0] = 85;
		marks[1] = 90;
		marks[2] = 92;
		
		System.out.println("");
		for(int m=0; m<marks.length; m++)
			System.out.println(marks[m]);
		
		// How to resolved similar (homogeneous) types of data issue
		
		// BY creating object array
		
		Object emp[] = new Object[5];
		emp[0] = "Talha";
		emp[1] = 30;
		emp[2] = 70000;
		emp[3] = 'M';
		emp[4] = "New York";
		
		System.out.println("");
		for(int em=0; em<emp.length; em++) {
			System.out.println(emp[em]);
		}
		

		
		
		

	}

}
