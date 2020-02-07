package com.bridgelabz.cliniquemanagement.model;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/05
 */
public class Patients {
	private String name;
	private int id;
	private long mobile_number;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Patients(String name, int id, long mobile_number, int age) {
		this.name = name;
		this.id = id;
		this.mobile_number = mobile_number;
		this.age = age;
	}

	public Patients() {
	}
}
