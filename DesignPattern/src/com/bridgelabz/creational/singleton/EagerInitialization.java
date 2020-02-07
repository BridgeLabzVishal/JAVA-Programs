package com.bridgelabz.creational.singleton;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/06
 * @Purpose : To create the singleton design pattern using EagerInitialization
 *          approach
 */
public class EagerInitialization {

	private static String message;

	public String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		EagerInitialization.message = message;
	}

	private static EagerInitialization eagerInitialization = new EagerInitialization();

	// constructor
	private EagerInitialization() {

	}

	/**
	 * define function to get the instance of class
	 * 
	 * @return EagerInitialization
	 */
	public static EagerInitialization getInstance() {
		return eagerInitialization;
	}

	@Override
	public String toString() {
		return "EagerInitialization [getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
