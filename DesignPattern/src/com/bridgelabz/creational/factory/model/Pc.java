package com.bridgelabz.creational.factory.model;
/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/07
 */

import com.bridgelabz.creational.factory.services.Computer;

public class Pc extends Computer {
	private String ram;
	private String hdd;
	private String cpu;

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Ram =" + ram + ", Hdd=" + hdd + ", Cpu=" + cpu;
	}
}
