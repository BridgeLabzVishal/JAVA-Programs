package com.bridgelabz.cliniquemanagement.services;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/05
 */
import java.util.Iterator;
import java.util.Random;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.cliniquemanagement.model.Doctors;
import com.bridgelabz.cliniquemanagement.model.Patients;
import com.bridgelabz.utility.InputUtility;
import com.bridgelabz.utility.Utility;

public class ServicesImplement implements IServices {

	static final String PATH_PATIENTS = "/home/user/eclipse-workspace/Oops/src/com/bridgelabz/cliniquemanagement/repository/Patients.json";
	static final String PATH_DOCTORS = "/home/user/eclipse-workspace/Oops/src/com/bridgelabz/cliniquemanagement/repository/Doctors.json";
	static final String PATH_APPOINTMENT = "/home/user/eclipse-workspace/Oops/src/com/bridgelabz/cliniquemanagement/repository/";

	Patients patient = new Patients(); // creating an object of Patients class
	Doctors doctor = new Doctors(); // creating an object of Doctors class
	JSONObject rootObject = new JSONObject();

	/**
	 * define function to add patients details in a file
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public JSONObject addPatients() {
		rootObject = Utility.readDetails(PATH_PATIENTS);
		JSONObject patientObject = new JSONObject();
		System.out.println("Enter Patient Information\n");

		System.out.println("Enter a name : ");
		patient.setName(InputUtility.next());
		patientObject.put("Name", patient.getName());

		System.out.println("Enter a age : ");
		patient.setAge(InputUtility.nextInteger());
		patientObject.put("Age", patient.getAge());

		String patientId = generateId();
		patient.setId(Integer.parseInt(patientId));
		patientObject.put("ID", patient.getId());

		System.out.println("Enter a mobile number :");
		patient.setMobile_number(InputUtility.nextlong());
		patientObject.put("Mobile_Number", patient.getMobile_number());

		rootObject.put(patient.getId(), patientObject);
		Utility.writeToFile(rootObject, PATH_PATIENTS);

		return patientObject;
	}

	@SuppressWarnings("unchecked")
	/**
	 * define function to add doctors details in a file
	 */
	public JSONObject addDoctors() {

		JSONObject doctorObject = new JSONObject();
		rootObject = Utility.readDetails(PATH_DOCTORS);
		System.out.println("Enter Doctor Information\n");

		System.out.println("Enter a name : ");
		doctor.setName(InputUtility.next());
		doctorObject.put("Name", doctor.getName());

		String doctorId = generateId();
		doctor.setId(Integer.parseInt(doctorId));
		doctorObject.put("ID", doctor.getId());

		System.out.println("Enter a specialization : ");
		doctor.setSpecialization(InputUtility.next());
		doctorObject.put("Specialization", doctor.getSpecialization());

		System.out.println("Enter time of availability : ");
		doctor.setAvailability(InputUtility.next());
		doctorObject.put("Availability", doctor.getAvailability());

		rootObject.put(doctor.getId(), doctorObject);
		Utility.writeToFile(rootObject, PATH_DOCTORS);

		return doctorObject;
	}

	/**
	 * define function to search and read doctor details from file
	 * 
	 * @param key
	 * @param value
	 */
	public void readDoctorDetails(String key, String value) {
		String string = Utility.readFromFile(PATH_DOCTORS);
		JSONParser parser = new JSONParser();
		JSONObject innerObject = null;
		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(string);
			innerObject = (JSONObject) objectFile.get(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\nDoctor Information:");
		System.out.println("Name: " + innerObject.get("Name") + "\t");
		System.out.println("ID: " + innerObject.get("ID") + "\t");
		System.out.println("Specialization: " + innerObject.get("Specialization") + "\t");
		System.out.println("Availability: " + innerObject.get("Availability") + "\t");
	}

	/**
	 * define function to search and read patients details from file
	 * 
	 * @param key
	 * @param value
	 */
	public void readPatientDetails(String key, String value) {
		String string = Utility.readFromFile(PATH_PATIENTS);
		JSONParser parser = new JSONParser();
		JSONObject innerObject = null;
		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(string);
			innerObject = (JSONObject) objectFile.get(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nPatient Information:");
		System.out.println("Name: " + innerObject.get("Name") + "\t");
		System.out.println("ID: " + innerObject.get("Id") + "\t");
		System.out.println("Mobile_Number :" + innerObject.get("Mobile_Number") + "\t");
		System.out.println("Age :" + innerObject.get("Age") + "\t");
	}

	/**
	 * define function to generate random id
	 * 
	 * @return String
	 */
	public String generateId() {
		Random random = new Random();
		return String.valueOf(random.nextInt(1000) + 1);
	}

	/**
	 * define function to update patient's details
	 */
	@SuppressWarnings("unchecked")
	public void updatePatients() {
		JSONObject updateObject = new JSONObject();
		JSONObject innerObject = null;
		updateObject = Utility.readDetails(PATH_PATIENTS);

		System.out.print("Enter a ID :");
		int patientId = InputUtility.nextInteger();
		String value = Integer.toString(patientId);

		innerObject = (JSONObject) updateObject.get(value);

		System.out.println("Patient Information:");
		System.out.println("Name: " + innerObject.get("Name") + "\t");
		System.out.println("Mobile_Number :" + innerObject.get("Mobile_Number") + "\t");
		System.out.println("Age :" + innerObject.get("Age") + "\t");

		System.out.println("Which key value you want to update ");
		System.out.println("1. Name ");
		System.out.println("2. Age ");
		System.out.println("3. Mobile Number ");
		System.out.println("4. All details ");
		int choice = InputUtility.nextInteger();
		switch (choice) {
		case 1:
			System.out.println("Enter a new name : ");
			patient.setName(InputUtility.next());
			innerObject.replace("Name", patient.getName());
			updateObject.put(value, innerObject);
			Utility.writeToFile(updateObject, PATH_PATIENTS);
			break;

		case 2:
			System.out.println("Enter new age :");
			patient.setAge(InputUtility.nextInteger());
			innerObject.replace("Age", patient.getAge());
			updateObject.put(value, innerObject);
			Utility.writeToFile(updateObject, PATH_PATIENTS);
			break;
		case 3:
			System.out.println("Enter new mobile number");
			patient.setMobile_number(InputUtility.nextlong());
			innerObject.replace("Mobile_Number", patient.getMobile_number());
			updateObject.put(value, innerObject);
			Utility.writeToFile(updateObject, PATH_PATIENTS);
			break;

		case 4:
			System.out.println("Enter a new name : ");
			patient.setName(InputUtility.next());
			innerObject.replace("Name", patient.getName());

			System.out.println("Enter new age :");
			patient.setAge(InputUtility.nextInteger());
			innerObject.replace("Age", patient.getAge());

			System.out.println("Enter new mobile number");
			patient.setMobile_number(InputUtility.nextlong());
			innerObject.replace("Mobile_Number", patient.getMobile_number());

			updateObject.put(value, innerObject);
			Utility.writeToFile(updateObject, PATH_PATIENTS);
			break;
		}
	}

	/**
	 * define function to update doctor's details
	 */
	@SuppressWarnings("unchecked")
	public void updateDoctors() {
		JSONObject updateObject = new JSONObject();
		JSONObject innerObject = null;
		updateObject = Utility.readDetails(PATH_DOCTORS);

		System.out.print("Enter a ID :");
		int doctorId = InputUtility.nextInteger();
		String value = Integer.toString(doctorId);

		innerObject = (JSONObject) updateObject.get(value);

		System.out.println("Doctor Information:");
		System.out.println("Name: " + innerObject.get("Name") + "\t");
		System.out.println("Specialization: " + innerObject.get("Specialization") + "\t");
		System.out.println("Availability: " + innerObject.get("Availability") + "\t");

		System.out.println("Which key value you want to update ");
		System.out.println("1. Name ");
		System.out.println("2. Specialization ");
		System.out.println("3. Availability ");
		System.out.println("4. All details ");
		int choice = InputUtility.nextInteger();
		switch (choice) {
		case 1:
			System.out.println("Enter a new name : ");
			doctor.setName(InputUtility.next());
			innerObject.replace("Name", doctor.getName());
			updateObject.put(value, innerObject);
			Utility.writeToFile(updateObject, PATH_DOCTORS);
			break;
		case 2:
			System.out.println("Enter new Specialization :");
			doctor.setSpecialization(InputUtility.next());
			innerObject.replace("Specialization", doctor.getSpecialization());
			updateObject.put(value, innerObject);
			Utility.writeToFile(updateObject, PATH_DOCTORS);
			break;
		case 3:
			System.out.println("Enter new Availability");
			doctor.setAvailability(InputUtility.next());
			innerObject.replace("Availability", doctor.getAvailability());
			updateObject.put(value, innerObject);
			Utility.writeToFile(updateObject, PATH_DOCTORS);
			break;
		case 4:
			System.out.println("Enter a new name : ");
			doctor.setName(InputUtility.next());
			innerObject.replace("Name", doctor.getName());

			System.out.println("Enter new Specialization :");
			doctor.setSpecialization(InputUtility.next());
			innerObject.replace("Specialization", doctor.getSpecialization());

			System.out.println("Enter new Availability");
			doctor.setAvailability(InputUtility.next());
			innerObject.replace("Availability", doctor.getAvailability());

			updateObject.put(value, innerObject);
			Utility.writeToFile(updateObject, PATH_DOCTORS);
			break;
		}
	}

	/**
	 * define function to get the appointment from the doctor but first add
	 * patient's details into the patient's file
	 */
	@Override
	public void getAppointment() {

		JSONObject patientObject = new JSONObject();
		System.out.println("1.New Patient ");
		System.out.println("2.Old Patient ");
		int patientChoice = InputUtility.nextInteger();

		if (patientChoice == 1) {
			patientObject = addPatients();
			updateAppointment(patientObject);
		} else {
			System.out.print("Enter a ID :");
			int patientId = InputUtility.nextInteger();
			patientObject = readPatients("ID", Integer.toString(patientId));
			updateAppointment(patientObject);
		}
	}

	/**
	 * define function to add the details into appointment file
	 * 
	 * @param object
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	private void updateAppointment(JSONObject object) {

		JSONArray readArray = new JSONArray();
		System.out.print("Enter a doctor ID :");
		int doctorId = InputUtility.nextInteger();

		readArray = Utility.readArray(PATH_APPOINTMENT + "Appointment_" + doctorId + ".json");
		Iterator<?> iterator = readArray.iterator();
		int appointment = 0;
		while (iterator.hasNext()) {
			JSONObject jsonObject = (JSONObject) iterator.next();

			appointment++;
		}
		if (appointment < 5) {
			object.put("Doctor_Id", doctorId);
			readArray.add(object);
			Utility.writeToFile(readArray, PATH_APPOINTMENT + "Appointment_" + doctorId + ".json");
		} else {
			System.out.println("Today's appointment list is full,try for another day.");
		}

		printReport(object);
	}

	private void printReport(JSONObject object) {
		System.out.println("You want to print report(yes/no) : ");
		String reportChoice = InputUtility.next();
		if (reportChoice.compareToIgnoreCase("yes") == 0) {
			System.out.println("********************Patient Report********************");
			System.out.println("Name: " + object.get("Name") + "\t");
			System.out.println("ID: " + object.get("ID") + "\t");
			System.out.println("Mobile_Number :" + object.get("Mobile_Number") + "\t");
			System.out.println("Age :" + object.get("Age") + "\t");
			System.out.println("Doctor_Id:" + object.get("Doctor_Id") + "\t");
		} else {
			System.out.println("Thank You !!");
		}
	}

	/**
	 * define function to read patients details
	 * 
	 * @param key
	 * @param value
	 * @return JSONObject
	 */
	public JSONObject readPatients(String key, String value) {

		String string = Utility.readFromFile(PATH_PATIENTS);
		JSONParser parser = new JSONParser();
		JSONObject innerObject = null;
		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(string);
			innerObject = (JSONObject) objectFile.get(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return innerObject;
	}
}
