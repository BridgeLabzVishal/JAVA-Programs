package com.bridgelabz.addressbook.model;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/03
 **/
public class Person {
	private String first_name;
	private String last_name;
	private String city;
	private String state;
	private String address;
	private long phone_number;
	private int zip;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Person [FirstName=" + first_name + ", LastName=" + last_name + ", phoneNumber=" + phone_number
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
}
