package com.bridgelabz.datastructure;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/11/22
 * @Purpose : Take an Arithmetic Expression such as
 *          (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to
 *          order the performance of operations. Ensure parentheses must appear
 *          in a balanced fashion.
 */
import com.bridgelabz.utility.InputUtility;

public class BalancedParenthesis {
	/**
	 * Define static function balancedParenthesis() to balanced the parenthesis
	 * 
	 * @param expression --> char
	 * @param length     --> int
	 * @return boolean
	 */
	public static boolean balancedParenthesis(char[] expression, int length) {
		Stack stack = new Stack(length);
		// logic to check parenthesis in expression
		for (int i = 0; i < length; i++) {
			if (expression[i] == '{' || expression[i] == '(' || expression[i] == '[')
				stack.push(expression[i]);
			if (expression[i] == '}' || expression[i] == ')' || expression[i] == ']') {
				if (stack.isEmpty()) {
					return false;
				} else {
					if (!isMatchingPair(stack.pop(), expression[i]))
						return false;
				}
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	/**
	 * define static function isMatchingPair() to match the opened and closed
	 * parenthesis to make pairs
	 * 
	 * @param ch1 ==> char
	 * @param ch2 ==> char
	 * @return boolean
	 */
	public static boolean isMatchingPair(char ch1, char ch2) {
		if (ch1 == '(' && ch2 == ')')
			return true;
		else if (ch1 == '{' && ch2 == '}')
			return true;
		else if (ch1 == '[' && ch2 == ']')
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the expression : ");
		char[] expression = InputUtility.nextLine().toCharArray();
		int length = expression.length;

		// checking the parenthesis is balanced or not
		if (balancedParenthesis(expression, length))
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
	}
}
