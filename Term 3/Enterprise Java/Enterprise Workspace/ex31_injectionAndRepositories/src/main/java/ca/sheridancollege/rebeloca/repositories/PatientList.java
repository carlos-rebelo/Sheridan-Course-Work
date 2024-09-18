package ca.sheridancollege.rebeloca.repositories;

import java.util.List;

import ca.sheridancollege.rebeloca.beans.Patient;

public interface PatientList {
	public List<Patient> getPatientList();
	public void setPatientList(List<Patient> patientList);
	public void emptyList();
}
