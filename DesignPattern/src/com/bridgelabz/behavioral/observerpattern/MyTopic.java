package com.bridgelabz.behavioral.observerpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 */
import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

	private List<Observer> list;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();

	public MyTopic() {
		this.list = new ArrayList<>();
	}

	/**
	 * define function for adding a observers in list
	 */
	@Override
	public void register(Observer observer) {
		if (observer == null)
			throw new NullPointerException("No Observer");
		synchronized (MUTEX) {
			if (!list.contains(observer))
				list.add(observer);
		}
	}

	/**
	 * define function for removing a observers in list
	 */
	@Override
	public void unregister(Observer observer) {
		synchronized (MUTEX) {
			list.remove(observer);
		}
	}

	/**
	 * define function for notifying their observers
	 */
	@Override
	public void notifyObservers() {
		List<Observer> listObserver = null;
		synchronized (MUTEX) {
			if (!changed)
				return;
			listObserver = new ArrayList<>(this.list);
		}
		for (Observer object : listObserver)
			object.update();
	}

	/**
	 * define function to update the message to observers
	 * 
	 * @return Object
	 */
	@Override
	public Object getUpdate(Observer observer) {
		return this.message;
	}

	/**
	 * define function for sending a message to observers
	 * 
	 * @param message
	 */
	public void postMessage(String message) {
		System.out.println("Message Posted to Topic : " + message);
		this.message = message;
		this.changed = true;
		notifyObservers();
	}
}
