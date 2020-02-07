package com.bridgelabz.behavioral.observerpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 */
public interface Observer {
	void update();

	void setSubject(Subject subject);
}
