package com.talosDigital.test;


import com.talosDigital.Reflection.Reflection;
import com.talosDigitial.Logic.Example;

import org.junit.Test;
/**
 * 
 * @author juandavidhenao
 * @version 02/10/2014
 */
public class ReflectionTest {

	/**
	 * this method test the reflection method
	 */
	@Test
	public void test() {
		Example examp = new Example();
		Reflection.getObjectDetails(examp);
	}

}
