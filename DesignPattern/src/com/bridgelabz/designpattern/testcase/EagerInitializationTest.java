package com.bridgelabz.designpattern.testcase;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/06
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bridgelabz.creational.singleton.EagerInitialization;

class EagerInitializationTest {

	@SuppressWarnings("static-access")
	@Test
	public void testGetMessage_setMessage_Get_Expected_Message() {
		EagerInitialization eagerInitialization = EagerInitialization.getInstance();
		eagerInitialization.setMessage("I am EagerInitializaton class");
		Assertions.assertEquals("I am EagerInitializaton class", eagerInitialization.getMessage());
	}

	@Test
	public void testHashCode_Check_HahCode_Get_HashCode() {
		EagerInitialization eagerInitialization = EagerInitialization.getInstance();
		int hashCode = eagerInitialization.hashCode();
		Assertions.assertEquals(hashCode, EagerInitialization.getInstance().hashCode());
	}

	@SuppressWarnings("static-access")
	@Test
	public void testGetClass_Check_ClassName_Expected_ClassName() {
		EagerInitialization eagerInitialization = EagerInitialization.getInstance();
		Class<? extends EagerInitialization> className = eagerInitialization.getClass();
		Assertions.assertEquals(className, eagerInitialization.getInstance().getClass());
	}

}
