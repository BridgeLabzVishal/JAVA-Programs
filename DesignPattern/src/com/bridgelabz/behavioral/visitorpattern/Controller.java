package com.bridgelabz.behavioral.visitorpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09 Purpose : To make Shopping cart where we can add different
 *       type of items. When we click on checkout button, it calculates the
 *       total amount to be paid.Now we can have the calculation logic in item
 *       classes or we can move out this logic to another class using visitor
 *       pattern.
 */
public class Controller {

	/**
	 * define function to calculate total price of items
	 * 
	 * @param items
	 * @return sum
	 */
	public static int calculate(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImplementation();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Book(150, "2468"), new Fruit(10, 2, "Apple") };

		int total = calculate(items);
		System.out.println("Total Cost = " + total);
	}
}
