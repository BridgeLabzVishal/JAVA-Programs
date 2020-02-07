package com.bridgelabz.behavioral.visitorpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 */
public abstract class Fruit implements ItemElement {
	private String name;
	private int pricePerKg;
	private int weight;

	public String getName() {
		return name;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	public Fruit(int pricePerKg, int weight, String name) {
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}

	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
