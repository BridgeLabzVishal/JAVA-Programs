package com.bridgelabz.behavioral.observerpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 */

public class MyTopicSubscriber implements Observer {
	private String name;
	private Subject topic;

	@Override
	/**
	 * define function to update the observer
	 */
	public void update() {
		String message = (String) topic.getUpdate(this);
		if (message == null) {
			System.out.println(name + ":: No new message");
		} else
			System.out.println(name + ":: Consuming message::" + message);
	}

	/**
	 * define function to add subject
	 */
	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;
	}

	/**
	 * define function for assigning name to client
	 * @param name
	 */
	public MyTopicSubscriber(String name) {
		this.name = name;
	}
}
