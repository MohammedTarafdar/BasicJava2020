package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {

		
		IbnSina ibn = new IbnSina();
		ibn.ambulanceServices();
		ibn.emergencyServices();
		ibn.entServices();
		ibn.medicalInsurance();
		
		// Top casting
		
		USMedical usIbn = new IbnSina();
		
		usIbn.physioServices();
		usIbn.oncologyServices();
		usIbn.orthopedicServices();
		
		UKMedical ukIbn = new IbnSina();
		
		ukIbn.ambulanceServices();
		ukIbn.entServices();
		
		

	}

}
