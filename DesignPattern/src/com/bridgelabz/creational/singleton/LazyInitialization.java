package com.bridgelabz.creational.singleton;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/06 Purpose : To create the singleton design pattern using
 *       LazyInitialization approach
 */
public class LazyInitialization {

	private static String message;
	private static LazyInitialization lazyInitialization = null;

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		LazyInitialization.message = message;
	}

	// private constructor
	private LazyInitialization() {

	}

	/**
	 * define function to get the instance of class
	 * 
	 * @return LazyInitialization
	 */
	public static LazyInitialization getInstance() {
		if (lazyInitialization == null) {
			lazyInitialization = new LazyInitialization();
		}
		return lazyInitialization;
	}

	@Override
	public String toString() {
		return "LazyInitialization [getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
