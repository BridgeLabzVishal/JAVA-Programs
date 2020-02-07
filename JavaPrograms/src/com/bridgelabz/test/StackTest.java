package com.bridgelabz.test;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/11/22
 *
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bridgelabz.utility.Stack;

class StackTest {
	Stack<Integer> stack = new Stack<Integer>();

	/**
	 * Test method for {@link com.bridgeLabz.utility.Stack#pop()}.
	 */
	@Test
	public void testPop_To_Pop_First_Element_Of_Stack_Is_12() {
		stack.push(6);
		stack.push(8);
		stack.push(10);
		stack.push(12);
		Assertions.assertEquals(12, stack.pop());
	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.Stack#peek()}.
	 */
	@Test
	public void testPeek_To_Check_Last_Element_Value_Is_10() {
		stack.push(6);
		stack.push(8);
		stack.push(10);
		Assertions.assertEquals(10, stack.peek());
	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.Stack#size()}.
	 */
	@Test
	public void testSize_To_Check_Size_When_Two_Elements_Present() {
		stack.push(6);
		stack.push(8);
		stack.push(10);
		Assertions.assertEquals(3, stack.size());
	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.Stack#isEmpty()}.
	 */
	@Test
	public void testIsEmpty_To_Check_When_Stack_is_Not_Empty() {
		stack.push(6);
		stack.push(8);
		stack.push(10);
		Assertions.assertEquals(false, stack.isEmpty());
	}

	@Test
	public void testIsEmpty_To_Check_When_Stack_is_Empty() {
		Assertions.assertEquals(true, stack.isEmpty());
	}

}
