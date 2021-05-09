package com.calculator.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {
	
	StringCalculator stringcalc = new StringCalculator();

	@Test
	public void test1(){
		try {
		assertEquals(0, stringcalc.add(""));
		assertEquals(1, stringcalc.add("1"));
		assertEquals(9, stringcalc.add("9"));
		assertEquals(3, stringcalc.add("1,2"));
		assertEquals(11, stringcalc.add("5,6"));
		}
		catch(Exception e){
			
		}
	}
	
	@Test
	public void test2(){
		try {
		assertEquals(6, stringcalc.add("//[*][%]\\n1*2%3"));
		assertEquals(6, stringcalc.add("//[***]\\n1***2***3"));
		assertEquals(3, stringcalc.add("//;\\n1;2"));
		assertEquals(6, stringcalc.add("1\\n2,3"));
		}
		catch(Exception e) {
			
		}
	}
	
	@Test
	public void test3(){
		try {
		assertEquals(2, stringcalc.add("1002,2"));
		}
		catch(Exception e) {
			
		}
	}

}
