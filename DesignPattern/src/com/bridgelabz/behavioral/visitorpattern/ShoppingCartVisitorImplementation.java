package com.bridgelabz.behavioral.visitorpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/08
 */
public class ShoppingCartVisitorImplementation implements ShoppingCartVisitor {

	/**
	 * define function to check the cost of books
	 * 
	 * @param book
	 * @return cost
	 */
	@Override
	public int visit(Book book) {
		int cost = 0;
		if (book.getPrice() > 50)
			cost = book.getPrice() - 5;
		else
			cost = book.getPrice();
		System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
		return cost;

	}

	/**
	 * define function to check the cost of fruits
	 * 
	 * @param fruit
	 * @return cost
	 */
	@Override
	public int visit(Fruit fruit) {
		int cost = 0;
		cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println(fruit.getName() + " cost = " + cost);
		return cost;
	}
}
