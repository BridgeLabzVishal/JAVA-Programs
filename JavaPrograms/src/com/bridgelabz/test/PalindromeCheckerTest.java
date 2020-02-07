package com.bridgelabz.test;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/23
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bridgelabz.datastructure.PalindromeChecker;

@SuppressWarnings("unused")
class PalindromeCheckerTest {

	/**
	 * Test method for
	 * {@link com.bridgeLabz.dataStructure.PalindromeChecker#main(java.lang.String[])}.
	 */
	static PalindromeChecker palindrome = new PalindromeChecker();

	@SuppressWarnings("static-access")
	@Test

	public static void isPalindrome_If_radar_Is_passed() {
		Assertions.assertEquals(true, palindrome.isPalindrome("radar"));
	}

	@SuppressWarnings("static-access")
	@Test
	public static void isPalindrome_If_madam_Is_passed() {
		Assertions.assertEquals(true, palindrome.isPalindrome("madam"));

	}

	@SuppressWarnings("static-access")
	@Test
	public static void isPalindrome_If_Sir_Is_passed() {
		Assertions.assertEquals(true, palindrome.isPalindrome("vishal"));
	}
}
