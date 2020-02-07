package com.bridgelabz.behavioral.mediatorpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 */
public class UserImplementation extends User {

	// constructor
	public UserImplementation(IChatMediator chatMediator, String name) {
		super(chatMediator, name);
	}

	/**
	 * define function to send message to user
	 * 
	 * @param message
	 */
	@Override
	public void send(String message) {
		System.out.println(this.name + " Sending a message : " + message);
		chatMediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " Receiving a message : " + message);
	}
}