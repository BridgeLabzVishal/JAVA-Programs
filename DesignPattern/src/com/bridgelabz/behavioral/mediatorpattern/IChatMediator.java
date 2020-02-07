package com.bridgelabz.behavioral.mediatorpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 */
public interface IChatMediator {

	void sendMessage(String message, User user);

	void addUser(User user);

}
