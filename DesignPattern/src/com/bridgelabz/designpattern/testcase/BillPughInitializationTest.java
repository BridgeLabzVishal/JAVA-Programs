package com.bridgelabz.designpattern.testcase;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/06
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bridgelabz.creational.singleton.BillPughInitialization;

class BillPughInitializationTest {

	@SuppressWarnings("static-access")
	@Test
	public void testGetMessage_setMessage_Get_Expected_Message() {

		BillPughInitialization billPughInitialization = BillPughInitialization.getInstance();
		billPughInitialization.setMessage("I am billPughInitialization class");
		Assertions.assertEquals("I am billPughInitialization class", billPughInitialization.getMessage());
	}

	@Test
	public void testHashCode_Check_HahCode_Get_HashCode() {
		BillPughInitialization billPughInitialization = BillPughInitialization.getInstance();
		int hashCode = billPughInitialization.hashCode();
		Assertions.assertEquals(hashCode, BillPughInitialization.getInstance().hashCode());
	}

	@Test
	public void testGetClass_Check_ClassName_Expected_ClassName() {
		BillPughInitialization billPughInitialization = BillPughInitialization.getInstance();
		Class<? extends BillPughInitialization> className = billPughInitialization.getClass();
		Assertions.assertEquals(className, BillPughInitialization.getInstance().getClass());
	}
}
