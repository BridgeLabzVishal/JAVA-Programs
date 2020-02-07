package com.bridgelabz.regex;

/**
 * @Author    : Vishal Yadav
 * @Version   : 1.0
 * @Date      : 2019/11/20
 * @Purpose    : To read in the following message: Hello <<name>>, We have your full name as <<full name>>
                in our system. your contact number is 91-xxxxxxxxxx.Please,let us know in case of any
                clarification Thank you BridgeLabz 01/01/2016.Use Regex to replace name, full name,
                Mobile#, and Date with proper value
 */
import java.util.Date;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.InputUtility;

public class CustomizeMessage {
	public static void main(String[] args) {
		UserDetails userDetails = new UserDetails();
		System.out.println("Enter First_Name : ");
		userDetails.setFirst_name(InputUtility;.nextLine());
		System.out.println("Enter Last_Name : ");
		userDetails.setLast_name(InputUtility.nextLine());
		System.out.println("Enter Mobile_No : ");
		userDetails.setMobile_no(InputUtility.nextLine());
		userDetails.setDate(Utility.getFormatedDate(new Date()));

		System.out.println(Utility.convertString(userDetails, Utility.readFromFile("vishal.txt")));
	}
}
