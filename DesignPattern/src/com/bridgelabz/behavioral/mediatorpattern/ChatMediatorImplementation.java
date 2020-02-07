package com.bridgelabz.behavioral.mediatorpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 */
import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImplementation implements IChatMediator {

	private List<User> userList;

	// constructor
	public ChatMediatorImplementation() {
		this.userList = new ArrayList<>();
	}

	/**
	 * define function to send message to all user
	 * 
	 * @param message
	 * @param user
	 */
	@Override
	public void sendMessage(String message, User user) {
		for (User users : this.userList) {
			if (users != user)
				users.receive(message);
		}
	}

	/**
	 * define function to add users in list
	 * 
	 * @param user
	 */
	@Override
	public void addUser(User user) {
		this.userList.add(user);
	}
}
