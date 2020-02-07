package com.bridgelabz.creational.singleton;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/06
 * @Purpose :To create the singleton design pattern using ThreadSafe by
 *          synchronization approach
 */
public class ThreadSafeInitilization {

	private static String message;
	private static ThreadSafeInitilization threadSafe = null;

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		ThreadSafeInitilization.message = message;
	}

	// private constructor
	private ThreadSafeInitilization() {
		if (threadSafe != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
		}
	}

	/**
	 * define function to get instance of class
	 * 
	 * @return ThreadSafeInitilization
	 */
	public static synchronized ThreadSafeInitilization getInstance() {
		if (threadSafe == null)
			threadSafe = new ThreadSafeInitilization();
		return threadSafe;
	}

	@Override
	public String toString() {
		return "ThreadSafeInitilization [getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
