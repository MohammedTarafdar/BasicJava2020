package interfaceConcept;

public class IbnSina implements USMedical, UKMedical, IndianMedical  {

	@Override
	public void physioServices() {
		System.out.println("IbnSina physio services");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("IbnSina oncology services");
		
	}

	@Override
	public void orthopedicServices() {
		System.out.println("IbnSina orthopedic services");
		
	}

	@Override
	public void entServices() {
		System.out.println("IbnSina ENT services");
		
	}

	@Override
	public void ambulanceServices() {
		System.out.println("IbnSina ambulance services");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("IbnSina emergency services");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("IbnSina neuro services");
		
	}

	@Override
	public void pediatricServices() {
		System.out.println("IbnSina pediatric services");
		
	}
	
	// WHO
	@Override
	public void polioServices() {
		// TODO Auto-generated method stub
		
	}
	
	// non overridden methods
	
	
	public void OPTServices() {
		System.out.println("IbnSina OPT services");
	}
	

	public void medicalInsurance() {
		System.out.println("IbnSina medical insurance services");
	}
	
	
	public void pathalogyServices() {
		System.out.println("IbnSina pathalogy services");
	}

	
	
	
	
}
