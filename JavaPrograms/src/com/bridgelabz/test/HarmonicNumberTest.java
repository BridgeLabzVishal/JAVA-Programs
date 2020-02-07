package com.bridgelabz.test;

/**
 * @Author : Vishal Yadav
 * @version : 1.0
 * @Date : 2019/11/19
 */
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import com.bridgelabz.basicprogram.HarmonicNumber;

class HarmonicNumberTest {
	HarmonicNumber harmonicNumber = new HarmonicNumber();

	/**
	 * Test method for
	 * {@link com.bridgeLabz.basicProgram.HarmonicNumber#harmonicNumber(int)}.
	 */

	@SuppressWarnings("static-access")
	@Test
	public void testHarmonicNumber_When_number_is_22_Get_sum() {
		Assertions.assertEquals(3.690813250217275, harmonicNumber.harmonicNumber(22));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testHarmonicNumber_When_number_is_0_Get_0() {
		Assertions.assertEquals(0, harmonicNumber.harmonicNumber(0));
	}
}
