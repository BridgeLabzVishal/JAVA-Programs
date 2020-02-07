package com.bridgelabz.behavioral.mediatorpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 * @Purpose : To make chat system using Mediator design pattern
 */
public class Controller {

	public static void main(String[] args) {

		IChatMediator chatMediator = new ChatMediatorImplementation();

		User user1 = new UserImplementation(chatMediator, "Vishal");
		User user2 = new UserImplementation(chatMediator, "Anirudh");
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);

		user1.send("Hi,Friends");
	}
}
