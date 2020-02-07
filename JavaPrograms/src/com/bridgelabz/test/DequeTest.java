package com.bridgelabz.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bridgelabz.utility.Deque;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/11/22
 *
 */
class DequeTest {
	Deque<Integer> deque = new Deque<Integer>();

	/**
	 * Test method for {@link com.bridgeLabz.utility.Deque#removeFront()}.
	 */
	@Test
	public void testRemoveFront_To_Remove_Front_Element_22_Expected_22() {
		deque.addFront(22);
		deque.addRear(21);
		deque.addRear(23);
		Assertions.assertEquals(22, deque.removeFront());
	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.Deque#removeRear()}.
	 */
	@Test
	public void testRemoveRear_To_Remove_Rear_Element_23_Get_23() {
		deque.addFront(22);
		deque.addRear(21);
		deque.addRear(23);
		Assertions.assertEquals(23, deque.removeRear());
	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.Deque#isEmpty()}.
	 */
	@Test
	public void testIsEmpty_To_Check_Deque_Is_Not_Empty() {
		deque.addFront(22);
		deque.addRear(21);
		deque.addRear(23);
		Assertions.assertEquals(false, deque.isEmpty());
	}

	@Test
	public void testIsEmpty_To_Check_Deque_Is_Empty() {
		Assertions.assertEquals(true, deque.isEmpty());

	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.Deque#size()}.
	 */
	@Test
	public void testSize_To_Get_Deque_Size_3() {
		deque.addFront(22);
		deque.addRear(21);
		deque.addRear(23);
		Assertions.assertEquals(3, deque.size());
	}

}
