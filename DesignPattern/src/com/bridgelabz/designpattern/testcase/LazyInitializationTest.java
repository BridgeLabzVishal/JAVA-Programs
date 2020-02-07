package com.bridgelabz.designpattern.testcase;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/06
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bridgelabz.creational.singleton.LazyInitialization;

class LazyInitializationTest {

	@SuppressWarnings("static-access")
	@Test
	public void testGetMessage_setMessage_Get_Expected_Message() {

		LazyInitialization lazyInitialization = LazyInitialization.getInstance();
		lazyInitialization.setMessage("I am lazyInitialization class");
		Assertions.assertEquals("I am lazyInitialization class", lazyInitialization.getMessage());
	}

	@Test
	public void testHashCode_Check_HahCode_Get_HashCode() {
		LazyInitialization lazyInitialization = LazyInitialization.getInstance();
		int hashCode = lazyInitialization.hashCode();
		Assertions.assertEquals(hashCode, LazyInitialization.getInstance().hashCode());
	}

	@Test
	public void testGetClass_Check_ClassName_Expected_ClassName() {
		LazyInitialization lazyInitialization = LazyInitialization.getInstance();
		Class<? extends LazyInitialization> className = lazyInitialization.getClass();
		Assertions.assertEquals(className, LazyInitialization.getInstance().getClass());
	}
}
