package com.bridgelabz.creational.factory.controller;

import com.bridgelabz.creational.factory.services.Computer;
import com.bridgelabz.creational.factory.services.ComputerFactory;
import com.bridgelabz.utility.Utility;

public class Controller {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.getComputer("Pc");
		Computer laptop = ComputerFactory.getComputer("Laptop");
		Computer servers = ComputerFactory.getComputer("Servers");

		System.out.println("Enter a Ram for pc : ");
		pc.setRam(Utility.nextLine());
		System.out.println("Enter a Hdd for pc : ");
		pc.setHdd(Utility.nextLine());
		System.out.println("Enter a Cpu for pc : ");
		pc.setCpu(Utility.nextLine());
		System.out.println("Pc Configuration : " + pc);

		System.out.println("Enter a Ram for laptop : ");
		laptop.setRam(Utility.nextLine());
		System.out.println("Enter a Hdd for laptop : ");
		laptop.setHdd(Utility.nextLine());
		System.out.println("Enter a Cpu for laptop : ");
		laptop.setCpu(Utility.nextLine());
		System.out.println("Laptop Configuration : " + laptop);

		System.out.println("Enter a Ram for servers : ");
		servers.setRam(Utility.nextLine());
		System.out.println("Enter a Hdd for servers : ");
		servers.setHdd(Utility.nextLine());
		System.out.println("Enter a Cpu for servers : ");
		servers.setCpu(Utility.nextLine());
		System.out.println("Servers Configuration : " + servers);
	}

}
