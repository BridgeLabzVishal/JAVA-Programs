package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.bridgelabz.datastructure.BalancedParenthesis;

class BalancedParenthesisTest {
	public BalancedParenthesis balanceParenthesis = new BalancedParenthesis();

	@SuppressWarnings("static-access")
	@Test
	public void balancedParenthesis_When_NoParanthesis() {
		String exp = "23*32";
		char ch[] = exp.toCharArray();
		int length = ch.length;
		assertEquals(true, balanceParenthesis.balancedParenthesis(ch, length), "Shows true as no parenthesis found");

		exp = "23*32-589+59";
		char ch1[] = exp.toCharArray();
		length = ch.length;
		assertEquals(true, balanceParenthesis.balancedParenthesis(ch1, length), "Shows true as no parenthesis found");
	}

	@SuppressWarnings("static-access")
	@Test
	public void balancedParenthesis_With_Paranthesis() {

		String exp = "(23*32)";
		char ch[] = exp.toCharArray();
		int length = ch.length;
		assertEquals(true, balanceParenthesis.balancedParenthesis(ch, length), "Shows true as no parenthesis found");

		exp = "(23*32)-(589+59)";
		char ch1[] = exp.toCharArray();
		length = ch.length;
		assertEquals(true, balanceParenthesis.balancedParenthesis(ch1, length), "Shows true as no parenthesis found");
	}

	@SuppressWarnings("static-access")
	@Test
	public void balancedParenthesis_With_One_Paranthesis() {
		String exp = "23*32)";
		char ch[] = exp.toCharArray();
		int length = ch.length;
		assertEquals(false, balanceParenthesis.balancedParenthesis(ch, length), "Shows false as no parenthesis found");

		exp = "(23*32-589+59";
		char ch1[] = exp.toCharArray();
		length = ch.length;
		assertEquals(false, balanceParenthesis.balancedParenthesis(ch1, length), "Shows false as no parenthesis found");
	}

	@SuppressWarnings("static-access")
	@Test
	public void isMatchingPair_with_Correct_Pair() {
		char ch = '(';
		char ch2 = ')';
		assertEquals(true, balanceParenthesis.isMatchingPair(ch, ch2));

		ch = '{';
		ch2 = '}';
		assertEquals(true, balanceParenthesis.isMatchingPair(ch, ch2));

		ch = '[';
		ch2 = ']';
		assertEquals(true, balanceParenthesis.isMatchingPair(ch, ch2));
	}

	@SuppressWarnings("static-access")
	@Test
	public void isMatchingPair_with_Wrong_Pair() {
		char ch = '(';
		char ch2 = ']';
		assertEquals(false, balanceParenthesis.isMatchingPair(ch, ch2));

		ch = '{';
		ch2 = ']';
		assertEquals(false, balanceParenthesis.isMatchingPair(ch, ch2));

		ch = '(';
		ch2 = '}';
		assertEquals(false, balanceParenthesis.isMatchingPair(ch, ch2));

		ch = '{';
		ch2 = ')';
		assertEquals(false, balanceParenthesis.isMatchingPair(ch, ch2));

		ch = '[';
		ch2 = '}';
		assertEquals(false, balanceParenthesis.isMatchingPair(ch, ch2));
	}

	@SuppressWarnings("static-access")
	@Test
	public void isMatchingPair_with_Same_Sign() {
		char ch = '(';
		char ch2 = '(';
		assertEquals(false, balanceParenthesis.isMatchingPair(ch, ch2));

		ch = '{';
		ch2 = '{';
		assertEquals(false, balanceParenthesis.isMatchingPair(ch, ch2));

		ch = '}';
		ch2 = '}';
		assertEquals(false, balanceParenthesis.isMatchingPair(ch, ch2));

		ch = ')';
		ch2 = ')';
		assertEquals(false, balanceParenthesis.isMatchingPair(ch, ch2));

		ch = '[';
		ch2 = '[';
		assertEquals(false, balanceParenthesis.isMatchingPair(ch, ch2));

		ch = ']';
		ch2 = ']';
		assertEquals(false, balanceParenthesis.isMatchingPair(ch, ch2));
	}
}
