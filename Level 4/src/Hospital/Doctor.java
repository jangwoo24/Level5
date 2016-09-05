
package Hospital;
import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> assignedList = new ArrayList<Patient>();
	
	Doctor() {
		
	}
	public void assignPatient(Patient p) throws DoctorFullException {
		if(assignedList.size()<=3)
		assignedList.add(p);
		else 
			throw new DoctorFullException("FULL");
	}
	ArrayList<Patient> getPatients() {
		return assignedList;
	}
	void doMedicine() {
		for(Patient p: assignedList) {
			p.caredFor=true;
		}
	}
	boolean performsSurgery() {
		return docSurgeon(this);
	}
	boolean docSurgeon(Doctor d) {
		if(d instanceof Surgeon) {
			return true;
		} else
			return false;
	}
	boolean makesHouseCalls() {
		return docGP(this);
	}
	boolean docGP(Doctor d) {
		if(d instanceof GeneralPractitioner) {
			return true;
		}
		else
			return false;
	}
	
}