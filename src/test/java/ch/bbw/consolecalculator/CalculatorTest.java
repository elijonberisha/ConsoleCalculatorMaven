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
	

}