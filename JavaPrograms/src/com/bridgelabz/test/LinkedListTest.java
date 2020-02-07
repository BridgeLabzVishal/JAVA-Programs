package com.bridgelabz.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bridgelabz.utility.LinkedList;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/11/22
 *
 */
class LinkedListTest {
	LinkedList<Integer> linkedList = new LinkedList<Integer>();

	/**
	 * Test method for {@link com.bridgeLabz.utility.LinkedList#pop()}.
	 */
	@Test
	public void testPop_To_Pop_Last_Element_From_LinkedList_Get_6() {
		linkedList.add(2);
		linkedList.append(3);
		linkedList.append(4);
		linkedList.append(5);
		linkedList.append(6);
		Assertions.assertEquals(6, linkedList.pop());
	}

	/**
	 * Test method for
	 * {@link com.bridgeLabz.utility.LinkedList#search(java.lang.Object)}.
	 */
	@Test
	public void testSearch_To_Search_5_Is_Present_In_LinkedList() {
		linkedList.add(2);
		linkedList.append(3);
		linkedList.append(4);
		linkedList.append(5);
		linkedList.append(6);
		Assertions.assertTrue(linkedList.search(5));
	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.LinkedList#isEmpty()}.
	 */
	@Test
	public void testIsEmpty_To_Check_LinkedList_Is_Empty() {
		Assertions.assertTrue(linkedList.isEmpty());
	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.LinkedList#isEmpty()}.
	 */
	@Test
	public void testIsEmpty_To_Check_LinkedList_Is_Not_Empty() {
		linkedList.add(2);
		linkedList.append(3);
		linkedList.append(4);
		linkedList.append(5);
		linkedList.append(6);
		Assertions.assertEquals(false, linkedList.isEmpty());
	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.LinkedList#pop(int)}.
	 */
	@Test
	public void testPopInt_To_Pop_Element_Position_4_Return_5() {
		linkedList.add(2);
		linkedList.append(3);
		linkedList.append(4);
		linkedList.append(5);
		linkedList.append(6);
		Assertions.assertEquals(5, linkedList.pop(4));
	}

	/**
	 * Test method for {@link com.bridgeLabz.utility.LinkedList#size()}.
	 */
	@Test
	public void testSize_To_Check_Size_Expected_4() {
		linkedList.add(2);
		linkedList.append(3);
		linkedList.append(4);
		linkedList.append(5);
		linkedList.append(6);
		Assertions.assertEquals(4, linkedList.size());
	}
}
