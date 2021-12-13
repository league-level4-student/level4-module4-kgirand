package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	List<Doctor> doctors = new ArrayList();
	List<Patient> patients = new ArrayList();
	public void addDoctor(Doctor generalPractitioner) {
		// TODO Auto-generated method stub
		doctors.add(generalPractitioner);
		
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void addPatients(Patient patient){
		patients.add(patient);
	}
	
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
	}

	

}
