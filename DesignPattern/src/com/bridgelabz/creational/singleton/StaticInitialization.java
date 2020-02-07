package com.bridgelabz.creational.singleton;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/06
 * @Purpose : To create the singleton design pattern using StaticInitialization
 *          approach
 */
public class StaticInitialization {

	private static String message;

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		StaticInitialization.message = message;
	}

	// private constructor
	private StaticInitialization() {

	}

	private static StaticInitialization staticInitialization = null;

	// static block to make for instantiation
	static {
		try {
			staticInitialization = new StaticInitialization();
		} catch (Exception e) {

		}
	}

	/**
	 * define function to get Instantiation of class
	 * 
	 * @return StaticInitialization
	 */
	public static StaticInitialization getInstance() {
		return staticInitialization;
	}

	@Override
	public String toString() {
		return "StaticInitialization [getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
