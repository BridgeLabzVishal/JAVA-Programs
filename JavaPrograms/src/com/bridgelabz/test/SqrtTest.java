package com.bridgelabz.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.bridgelabz.junit.Sqrt;

@SuppressWarnings("static-access")
class SqrtTest {
	Sqrt squareRoot = new Sqrt();

	@Test
	public void testSqrt_when_number_is_14() {
		Assertions.assertEquals(3.7416573867739413, squareRoot.sqrt(14.0));
	}

	@Disabled
	@Test
	public void testSqrt_when_number_is_Negative() {
		Assertions.assertEquals(3.7416573867739413, squareRoot.sqrt(-14));
	}

	@Test
	public void testSqrt_when_number_is_16() {
		Assertions.assertEquals(4.0, squareRoot.sqrt(16));
	}
}
