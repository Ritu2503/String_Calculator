package com.calculator.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {
	
	StringCalculator stringcalc = new StringCalculator();

	@Test
	public void test1(){
		
		assertEquals(0, stringcalc.add(""));
		
	}

}
