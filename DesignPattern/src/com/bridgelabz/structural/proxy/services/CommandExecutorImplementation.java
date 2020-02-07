package com.bridgelabz.structural.proxy.services;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/08
 */
import java.io.IOException;

public class CommandExecutorImplementation implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws IOException {
		Runtime.getRuntime().exec(cmd);
		System.out.println(cmd + "Command Excecuted Properly...");
	}

}