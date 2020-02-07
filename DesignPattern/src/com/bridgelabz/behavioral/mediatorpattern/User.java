package com.bridgelabz.behavioral.mediatorpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 */
public abstract class User {
	protected String name;
	protected IChatMediator chatMediator;

	public User(IChatMediator chatMediator, String name) {
		this.chatMediator = chatMediator;
		this.name = name;
	}

	public abstract void send(String message);

	public abstract void receive(String message);

}
