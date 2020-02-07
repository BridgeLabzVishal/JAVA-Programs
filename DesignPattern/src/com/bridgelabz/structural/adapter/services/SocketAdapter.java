package com.bridgelabz.structural.adapter.services;

import com.bridgelabz.structural.adapter.model.Volt;

public interface SocketAdapter {
	public Volt get120Volt();

	public Volt get12Volt();

	public Volt get3Volt();
}
