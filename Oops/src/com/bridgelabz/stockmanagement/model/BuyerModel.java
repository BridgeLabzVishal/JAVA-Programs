package com.bridgelabz.stockmanagement.model;

/**
 * @Author : Vishal Yadav
 * @Version : 2.0
 * @Date : 2019/12/16
 */
public class BuyerModel {
	private String name;
	private String companySymbol;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanySymbol() {
		return companySymbol;
	}

	public void setCompanySymbol(String companySymbol) {
		this.companySymbol = companySymbol;
	}

	@Override
	public String toString() {
		return "BuyerModel [name=" + name + ", companySymbol=" + companySymbol + "]";
	}
}
