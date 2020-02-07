package com.bridgelabz.stockmanagement.model;

/**
 * @Author : Vishal Yadav
 * @Version : 2.0
 * @Date : 2019/12/16
 */
public class SellerModel {
	private String name;
	private String companyName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Seller [name=" + name + ", companyName=" + companyName + "]";
	}
}
