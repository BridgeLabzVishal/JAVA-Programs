package com.bridgelabz.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bridgelabz.utility.Queue;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/11/22
 *
 */
class QueueTest {

	Queue<Integer> queue = new Queue<Integer>();

	/**
	 * Test method for {@link com.bridgeLabz.utility.Queue#pop()}.
	 */
	public void testPop_To_Pop_First_Element_Of_Queue_Is_6() {
		queue.enQueue(6);
		queue.enQueue(20);
		queue.enQueue(8);
		queue.enQueue(10);
		Assertions.assertEquals(6, queue.deQueue());
	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.Queue#isEmpty()}.
	 */
	@Test
	public void testIsEmpty_To_Check_When_Queue_is_Not_Empty() {
		queue.enQueue(8);
		queue.enQueue(10);
		Assertions.assertEquals(false, queue.isEmpty());
	}

	@Test
	public void testIsEmpty_method_To_Check_When_Queue_is_Empty() {

		Assertions.assertEquals(true, queue.isEmpty());
	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.Queue#getSize()}.
	 */
	@Test
	public void testGetSize_To_Check_Size_When_Two_Elements_Present() {
		queue.enQueue(8);
		queue.enQueue(10);
		Assertions.assertEquals(2, queue.getSize());
	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.Queue#peek()}.
	 */
	@Test
	public void testPeek_To_Check_Last_Element_Value_Is_10() {
		queue.enQueue(8);
		queue.enQueue(10);
		Assertions.assertEquals(10, queue.peek());
	}

}
