package com.bridgelabz.structural.adapter.controller;

import com.bridgelabz.structural.adapter.model.Volt;
import com.bridgelabz.structural.adapter.services.SocketAdapter;
import com.bridgelabz.structural.adapter.services.SocketObjectAdapter;

public class Controller {

	/**
	 * define function to check the socket class Adapter
	 */
	public static void socketClassAdapter() {

		// instantiation of SocketObjectAdapter
		SocketAdapter socket = new SocketObjectAdapter();
		Volt volt3 = getVolt(socket, 3);
		Volt volt12 = getVolt(socket, 12);
		Volt volt120 = getVolt(socket, 120);
		System.out.println("v3 volts using Class Adapter=" + volt3.getVolt());
		System.out.println("v12 volts using Class Adapter=" + volt12.getVolt());
		System.out.println("v120 volts using Class Adapter=" + volt120.getVolt());
	}

	/**
	 * define function to check the socket object Adapter
	 */
	public static void socketObjectAdapter() {

		// instantiation of SocketObjectAdapter
		SocketAdapter socket = new SocketObjectAdapter();
		Volt volt3 = getVolt(socket, 3);
		Volt volt12 = getVolt(socket, 12);
		Volt volt120 = getVolt(socket, 120);
		System.out.println("v3 volts using Object Adapter=" + volt3.getVolt());
		System.out.println("v12 volts using Object Adapter=" + volt12.getVolt());
		System.out.println("v120 volts using Object Adapter=" + volt120.getVolt());
	}

	// Main method
	public static void main(String[] args) {
		socketObjectAdapter();
		socketClassAdapter();
	}

	/**
	 * define function to get volt
	 * 
	 * @param socket
	 * @param i
	 * @return Volt
	 */
	private static Volt getVolt(SocketAdapter socket, int i) {
		switch (i) {
		case 3:
			return socket.get3Volt();
		case 12:
			return socket.get12Volt();
		case 120:
			return socket.get120Volt();
		default:
			return socket.get120Volt();
		}
	}

}
