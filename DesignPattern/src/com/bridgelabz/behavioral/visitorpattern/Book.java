package com.bridgelabz.behavioral.visitorpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 */
public class Book implements ItemElement {
	private int price;
	private String isbnNumber;

	public Book(int price, String isbnNumber) {
		this.price = price;
		this.isbnNumber = isbnNumber;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + ", isbnNumber=" + isbnNumber + "]";
	}

	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
