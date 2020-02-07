package com.bridgelabz.behavioral.observerpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 */
public interface Subject {
	void register(Observer observer);

	void unregister(Observer observer);

	void notifyObservers();

	Object getUpdate(Observer observer);
}
