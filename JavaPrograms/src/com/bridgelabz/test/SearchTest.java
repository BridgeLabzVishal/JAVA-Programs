package com.bridgelabz.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bridgelabz.utility.Search;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/11/19
 *
 */
class SearchTest {
	Search<Integer> search = new Search<Integer>();

	/**
	 * Test method for
	 * {@link com.bridgeLabz.utility.Search#linearSearch(T[], java.lang.Comparable, int, int)}.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testLinearSearch_To_Search_Number_12_Get_Index_Value_5() {
		Integer[] array = { 24, 18, 8, 45, 12, 13 };
		Assertions.assertEquals(5, search.linearSearch(array, 12));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testLinearSearch_To_Search_Number_16_Not_Present() {
		Integer[] array = { 24, 18, 8, 45, 12, 13 };
		Assertions.assertEquals(-1, search.linearSearch(array, 16));
	}

	/**
	 * Test method for
	 * {@link com.bridgeLabz.utility.Search#binarySearch(T[], java.lang.Comparable, int, int)}.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testBinarySearch_To_Search_Number_16_Get_Index_Value_4() {
		Integer[] array = { 8, 12, 13, 16, 22, 34, 45 };
		Assertions.assertEquals(4, search.binarySearch(array, 16, 0, 7));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testBinarySearch_To_Search_Number_28_Not_Present() {
		Integer[] array = { 8, 12, 13, 16, 22, 34, 45 };
		Assertions.assertEquals(-1, search.binarySearch(array, 28, 0, 7));
	}
}
