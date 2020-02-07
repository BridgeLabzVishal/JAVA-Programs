package com.bridgelabz.test;

/**
 * @Author   : Vishal Yadav
 * @version  : 1.0
 * @Date     : 2019/11/18
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.bridgelabz.logicalprogram.SwapNibbles;

class SwapNibblesTest {
	SwapNibbles swapNibbles = new SwapNibbles();

	/**
	 * Test method for
	 * {@link com.bridgeLabz.logicalPrograms.SwapNibbles#swapNibble(int)}.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testSwapNibble_When_number_is_100_Get_70() {
		Assertions.assertEquals(70, swapNibbles.swapNibble(100));
	}

	@Disabled
	@SuppressWarnings("static-access")
	@Test
	public void testSwapNibble_When_number_is_100_Get_100() {
		Assertions.assertEquals(100, swapNibbles.swapNibble(100));
	}
}
