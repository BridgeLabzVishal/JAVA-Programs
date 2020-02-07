package com.bridgelabz.behavioral.observerpattern;

import com.bridgelabz.utility.Utility;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 * @Purpose : Implement a simple topic and observers can register to this
 *          topic.Whenever any new message will be posted to the topic, all the
 *          registers observers will be notified and they can consume the
 *          message.
 */
public class Controller {

	public static void main(String[] args) {

		MyTopic topic = new MyTopic();

		System.out.println("Enter a Name : ");
		Observer object1 = new MyTopicSubscriber(Utility.next());
		System.out.println("Enter a Name : ");
		Observer object2 = new MyTopicSubscriber(Utility.next());
		System.out.println("Enter a Name : ");
		Observer object3 = new MyTopicSubscriber(Utility.next());

		topic.register(object1);
		topic.register(object2);
		topic.register(object3);

		object1.setSubject(topic);
		object2.setSubject(topic);
		object3.setSubject(topic);

		object1.update();

		topic.postMessage("Iphone Alert");
	}
}
