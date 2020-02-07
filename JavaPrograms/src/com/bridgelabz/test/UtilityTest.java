package com.bridgelabz.test;

/**
 * @Author   : Vishal Yadav
 * @version  : 1.0
 * @Date     : 2019/11/18
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.bridgelabz.utility.Utility;

class UtilityTest {

	Utility utility = new Utility();

	@SuppressWarnings("static-access")
	@Test
	public void testCountDigits_When_Expexted_Four() {
		Assertions.assertEquals(4, utility.countDigits(2016));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testIsleapYear_When_expected_leapYear_Get_true() {
		Assertions.assertTrue(utility.isleapYear(2016));
	}

	@Disabled
	@SuppressWarnings("static-access")
	@Test
	public void testIsleapYear_When_year_is_not_leapYear_Get_false() {
		Assertions.assertTrue(utility.isleapYear(2019));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testIsPrime_When_expected_PrimeNumber() {
		Assertions.assertTrue(utility.isPrime(919));
	}

	@Disabled
	@SuppressWarnings("static-access")
	@Test
	public void testIsPrime_When_expected_PrimeNumber1() {
		Assertions.assertTrue(utility.isPrime(220));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testIsAnagram_When_expected_Anagram_Returned_True() {
		Assertions.assertTrue(utility.isAnagram(919, 991));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testPower_When_expected_PowerOf2_Get_Expected_value() {
		Assertions.assertEquals(16, utility.power(2, 4));
	}
}
