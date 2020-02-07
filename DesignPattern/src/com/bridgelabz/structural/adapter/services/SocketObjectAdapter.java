package com.bridgelabz.structural.adapter.services;

import com.bridgelabz.structural.adapter.model.Socket;
import com.bridgelabz.structural.adapter.model.Volt;

public class SocketObjectAdapter implements SocketAdapter {

	// creating object of socket class as private
	private Socket sock = new Socket();

	/**
	 * define function to get120 Volt
	 * 
	 * @return Volt
	 */
	@Override
	public Volt get120Volt() {
		return sock.getVolt();
	}

	/**
	 * define function to get12 Volt
	 * 
	 * @return Volt
	 */
	@Override
	public Volt get12Volt() {
		Volt volt = sock.getVolt();
		return convertVolt(volt, 10);
	}

	/**
	 * define function to get3 Volt
	 * 
	 * @return Volt
	 */
	@Override
	public Volt get3Volt() {
		Volt volt = sock.getVolt();
		return convertVolt(volt, 40);
	}

	/**
	 * define function to convert the volt
	 * 
	 * @param volt
	 * @param i
	 * @return Volt
	 */
	private Volt convertVolt(Volt volt, int i) {
		return new Volt(volt.getVolt() / i);
	}

}
