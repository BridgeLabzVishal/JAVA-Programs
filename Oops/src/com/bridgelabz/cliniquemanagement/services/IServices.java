package com.bridgelabz.cliniquemanagement.services;

/**
 *@Author   :  Vishal Yadav
 *@Version  :  1.0
 *@Date     :  2019/12/05
 */
import org.json.simple.JSONObject;

public interface IServices {
	JSONObject addPatients();

	JSONObject addDoctors();

	void readDoctorDetails(String key, String value);

	void readPatientDetails(String key, String value);

	String generateId();

	void updatePatients();

	void updateDoctors();

	void getAppointment();

	public JSONObject readPatients(String key, String value);
}
