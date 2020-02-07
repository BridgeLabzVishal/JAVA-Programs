package com.bridgelabz.creational.factory.services;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/07
 */
public abstract class Computer {

	public abstract void setRam(String ram);

	public abstract void setHdd(String hdd);

	public abstract void setCpu(String cpu);

	public abstract String getRam();

	public abstract String getHdd();

	public abstract String getCpu();

	@Override
	public String toString() {
		return "Ram =" + this.getRam() + ", Hdd()=" + getHdd() + ", Cpu =" + getCpu() + " ";
	}

}
