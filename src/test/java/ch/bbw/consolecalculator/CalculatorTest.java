package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

/**
 * Test Class for Calculator.java
 * @author Berisha
 * @version 0.0.1
 */

import org.junit.Test;

public class CalculatorTest {
	Calculator testee; 
	
	@Test
	public void testSummeZweiPositive() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSubtraktionZweiPositive() {
		testee = new Calculator();
		assertTrue(testee.subtraktion(25, 10) == 15);
	}
	
	@Test 
	public void testAdditionZweiNegative() {
		testee = new Calculator(); 
		assertTrue(testee.summe(-10, -5) == -15);
	}
	

}
