package com.bridgelabz.structural.proxy.controller;

import com.bridgelabz.structural.proxy.repository.CommandExecutorProxy;
import com.bridgelabz.structural.proxy.services.CommandExecutor;
import com.bridgelabz.utility.InputUtility;

public class Controller {
	public static void main(String[] args) {
		System.out.println("Enter your User Id");
		String userId = InputUtility.nextLine();
		System.out.println("Enter your password");
		String password = InputUtility.nextLine();

		CommandExecutor execute = new CommandExecutorProxy(userId, password);
		try {
			execute.runCommand("ls -ltr");
			execute.runCommand("rm proxy.txt");
		} catch (Exception e) {
			System.out.println("Exception Message");
		}
	}
}