package com.bridgelabz.designpattern.testcase;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/06
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bridgelabz.creational.singleton.StaticInitialization;

class StaticInitializationTest {

	@SuppressWarnings("static-access")
	@Test
	public void testGetMessage_setMessage_Get_Expected_Message() {

		StaticInitialization staticInitialization = StaticInitialization.getInstance();
		staticInitialization.setMessage("I am StaticInitialization class");
		Assertions.assertEquals("I am StaticInitialization class", staticInitialization.getMessage());
	}

	@Test
	public void testHashCode_Check_HahCode_Get_HashCode() {
		StaticInitialization staticInitialization = StaticInitialization.getInstance();
		int hashCode = staticInitialization.hashCode();
		Assertions.assertEquals(hashCode, StaticInitialization.getInstance().hashCode());
	}

	@Test
	public void testGetClass_Check_ClassName_Expected_ClassName() {
		StaticInitialization staticInitialization = StaticInitialization.getInstance();
		Class<? extends StaticInitialization> className = staticInitialization.getClass();
		Assertions.assertEquals(className, StaticInitialization.getInstance().getClass());
	}
}
