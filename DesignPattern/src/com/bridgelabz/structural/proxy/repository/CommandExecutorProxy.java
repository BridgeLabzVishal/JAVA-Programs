package com.bridgelabz.structural.proxy.repository;

import com.bridgelabz.structural.proxy.services.CommandExecutor;
import com.bridgelabz.structural.proxy.services.CommandExecutorImplementation;
import com.bridgelabz.utility.InputUtility;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean admin;
	private CommandExecutor excecute;

	/**
	 * define function to get user id and password
	 * 
	 * @param user
	 * @param password
	 */
	public CommandExecutorProxy(String user, String password) {

		System.out.println("Enter the id");
		String id = InputUtility.nextLine();
		System.out.println("Enter the pass");
		String pass = InputUtility.nextLine();

		if (id.equalsIgnoreCase(user) && pass.equalsIgnoreCase(password))
			admin = true;
		excecute = new CommandExecutorImplementation();
	}

	/**
	 * define function to get run command
	 * 
	 * @param cmd
	 */
	public void runCommand(String cmd) throws Exception {
		if (admin) {
			excecute.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm command not there");
			} else {
				excecute.runCommand(cmd);
			}
		}
	}
}