package com.bridgelabz.creational.factory.services;
/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/07
 */

import com.bridgelabz.creational.factory.model.Laptop;
import com.bridgelabz.creational.factory.model.Pc;
import com.bridgelabz.creational.factory.model.Servers;

public class ComputerFactory {

	public static Computer getComputer(String type) {

		if ("Pc".equalsIgnoreCase(type))
			return new Pc();

		else if ("Servers".equalsIgnoreCase(type))
			return new Servers();

		else if ("Laptop".equalsIgnoreCase(type))
			return new Laptop();

		return null;
	}
}
