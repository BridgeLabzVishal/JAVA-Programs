package com.bridgelabz.creational.singleton;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/06
 * @Purpose : To create the singleton design pattern using
 *          BillPughInitialization approach
 */
public class BillPughInitialization {

	private static String message;

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		BillPughInitialization.message = message;
	}

	// private constructor
	private BillPughInitialization() {

	}

	/**
	 * define private static class to create instance as final private static
	 *
	 */
	private static class BillPugh {
		private static final BillPughInitialization INSTANCE = new BillPughInitialization();
	}

	/**
	 * define function to get INSTANCE of a class
	 * 
	 * @return BillPughInitialization
	 */
	public static BillPughInitialization getInstance() {
		return BillPugh.INSTANCE;
	}
}
