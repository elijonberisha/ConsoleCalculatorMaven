package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test Class for Calculator.java
 * @author Berisha
 * @version 0.0.1
 */

import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	
	@Before
    public void setUp() {
        testee = new Calculator();
    }
	
	@Test
	public void testSummeZweiPositive() {
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSubtraktionZweiPositive() {
		assertTrue(testee.subtraktion(25, 10) == 15);
	}
	
	@Test 
	public void testAdditionZweiNegative() {
		assertTrue(testee.summe(-10, -5) == -15);
	}
	
	@Test 
	public void testSubtraktionZweiNegative() {
		assertTrue(testee.subtraktion(-10, -25) == 15);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDividationByZeroException() {
		assertTrue(testee.divide(10, 0) == 0);
	}
	
	@Test 
	public void testDividationByZeroExceptionNotRaised() {
		try {
			assertTrue(testee.divide(10, 0) == 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}	
	}

}
