package com.bridgelabz.creational.singleton;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/06
 * @Purpose :To create the singleton design pattern using ThreadSafe by double
 *          locking synchronization approach
 */
public class ThreadSafeUsingSynchronized {

	private static String message;
	private static ThreadSafeUsingSynchronized threadSafe = null;

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		ThreadSafeUsingSynchronized.message = message;
	}

	// private constructor
	private ThreadSafeUsingSynchronized() {
		if (threadSafe != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
		}
	}

	/**
	 * define function to get instance of class
	 * 
	 * @return ThreadSafeUsingSynchronized
	 */

	public static ThreadSafeUsingSynchronized getInstance() {
		if (threadSafe == null)
			// synchronized block
			synchronized (ThreadSafeUsingSynchronized.class) {
				threadSafe = new ThreadSafeUsingSynchronized();
			}
		return threadSafe;
	}

	@Override
	public String toString() {
		return "ThreadSafeUsingSynchronized [getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
