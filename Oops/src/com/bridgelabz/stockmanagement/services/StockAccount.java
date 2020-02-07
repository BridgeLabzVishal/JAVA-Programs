package com.bridgelabz.stockmanagement.services;

/**
 * @Author : Vishal Yadav
 * @Version : 2.0
 * @Date : 2019/12/16
 */
public abstract class StockAccount {

	public abstract void buy(int amount, String companySymbol);

	public abstract void sell(int amount, String companySymbol);

	public abstract void printReport();

}
