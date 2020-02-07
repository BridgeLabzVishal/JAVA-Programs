package com.bridgelabz.creational.singleton;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/06
 * @Purpose : Create a program to perform destruction of singleton design pattern using Reflection approach
 */
import java.lang.reflect.Constructor;

public class Reflection {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		LazyInitialization lazyInitialization = LazyInitialization.getInstance();// to get instance of
																					// LazyInitialization

		LazyInitialization lazy_Initialization = null;
		try {
			Constructor[] constructors = LazyInitialization.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				lazy_Initialization = (LazyInitialization) constructor.newInstance();
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(lazyInitialization.hashCode());
		System.out.println(lazy_Initialization.hashCode());
	}

}
