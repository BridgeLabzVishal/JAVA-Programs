package com.bridgelabz.cliniquemanagement.controller;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/05
 * @Purpose : To maintain clinique management system. 
 */
import com.bridgelabz.cliniquemanagement.services.IServices;
import com.bridgelabz.cliniquemanagement.services.ServicesImplement;
import com.bridgelabz.utility.InputUtility;
import com.bridgelabz.utility.Utility;

public class Controller {

	public static void main(String[] args) {

		IServices service = new ServicesImplement();
		int ch = 0;
		do {
			System.out.println("**********************Clinique Management*******************");
			System.out.println("Choose any one : ");
			System.out.println("1. Patients");
			System.out.println("2. Doctors ");
			System.out.println("3. Exit ");
			int choice = InputUtility.nextInteger();
			switch (choice) {
			case 1:
				System.out.println("Choose any one : ");
				System.out.println("1. Appointment");
				System.out.println("2. View");
				System.out.println("3. Search");
				System.out.println("4. Update");
				int choice1 = InputUtility.nextInteger();
				switch (choice1) {
				case 1:
					service.getAppointment();
					break;

				case 2:
					System.out.println(Utility.readDetails(
							"/home/user/eclipse-workspace/Oops/src/com/bridgeLabz/Clinique/Repository/Patients.json"));
					break;

				case 3:
					System.out.print("Enter a ID :");
					int patientId = InputUtility.nextInteger();
					service.readPatientDetails("Id", Integer.toString(patientId)); // converting integer to string
					break;

				case 4:
					service.updatePatients();
					break;

				default:
					System.out.println("Invalid");
				}
				break;

			case 2:
				System.out.println("Choose any one : ");
				System.out.println("1. Add");
				System.out.println("2. View");
				System.out.println("3. Search");
				System.out.println("4. Update");
				int choice2 = InputUtility.nextInteger();
				switch (choice2) {
				case 1:
					service.addDoctors();
					break;

				case 2:
					System.out.println(Utility.readDetails(
							"/home/user/eclipse-workspace/Oops/src/com/bridgeLabz/Clinique/Repository/Doctors.json"));
					break;

				case 3:
					System.out.print("Enter a ID :");
					int doctorId = InputUtility.nextInteger();
					service.readDoctorDetails("Id", Integer.toString(doctorId)); // converting integer to string
					break;

				case 4:
					service.updateDoctors();
					break;

				default:
					System.out.println("Invalid");
				}
				break;

			case 3:
				System.out.println("Thank You");
				System.exit(0);

			default:
				System.out.println("Invalid");
			}

		} while (ch < 3);
	}
}
