package com.bridgelabz.structural.adapter.model;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/08
 */
public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}
}
