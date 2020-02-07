package com.bridgelabz.creational.singleton;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/06
 * @Purpose : To overcome the situation with Reflection, Joshua Bloch suggests
 *          the use of Enum to implement Singleton design pattern as Java
 *          ensures that any Enum value is instantiated only once in a Java
 *          program. Since Java Enum values are globally accessible, so is the
 *          singleton.
 **/

public class EnumSingletonImplementation {

	public static void main(String[] args) {

		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		enumSingleton.i = 2;
		enumSingleton.show(); // Calling show() using enumSingleton
		System.out.println("EnumSingleton : " + enumSingleton.hashCode());

		/*
		 * Without Enum We might get the value of enumSingleton.show() as 5 for no
		 * matter how many time you call the method
		 */

		System.out.println("----------------------------------\nEnumSingleton\n----------------------------------");

		EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
		enumSingleton2.i = 4;
		enumSingleton.show(); // Calling show() using enumSingleton
		System.out.println("EnumSingleton : " + enumSingleton2.hashCode());
	}
}

enum EnumSingleton {
	INSTANCE;

	int i;

	public void show() {
		System.out.println(i);
	}
}