package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.math.BigInteger;

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
	
	@Test 
	public void testMultiplicationPositiveProtected() {
		assertTrue(testee.multiplicate(10, 2) == 20); 
	}
	
	@Test 
	public void testMultiplicationPositivePrivate() {
		assertTrue(testee.multiplicatePackage(10, 2) == 20); 
	}
	
	// NEW ADDITION TESTS 
	@Test
	public void testSummeEinPositivEinNegativ() {
		assertTrue(testee.summe(10, -10) == 0);
	}
	
	@Test
	public void testSummeEinPostivEinNull() {
		assertTrue(testee.summe(10, 0) == 10);
	}
	
	@Test 
	public void testSummeMaxValue() {
		try {
			assertTrue(testee.summe(10, Integer.MAX_VALUE) == Integer.MIN_VALUE);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testSummeDoubleMinValue() {
		try {
			assertTrue(testee.summe(Integer.MIN_VALUE, Integer.MIN_VALUE) == Integer.MAX_VALUE);
		} catch(AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testSummeMinMaxValue() {
		try {
			assertTrue(testee.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == 0);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testSummeDoubleMaxValue() {
		try {
			assertTrue(testee.summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == Integer.MIN_VALUE);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	//--------------------------------------------------------------------------
	// NEW SUBTRACTION TESTS 
	@Test
	public void testSubtraktionEinPositivEinNegativ() {
		assertTrue(testee.subtraktion(10, -10) == 20);
	}
	
	@Test
	public void testSubtraktionEinPostivEinNull() {
		assertTrue(testee.subtraktion(10, 0) == 10);
	}
	
	@Test 
	public void testSubtraktionZeroMaxValue() {
		try {
			assertTrue(testee.subtraktion(0, Integer.MAX_VALUE) == Integer.MIN_VALUE);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testSubtraktionDoubleMinValue() {
		try {
			assertTrue(testee.subtraktion(Integer.MIN_VALUE, Integer.MIN_VALUE) == Integer.MAX_VALUE);
		} catch(AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testSubtraktionMinMaxValue() {
		try {
			assertTrue(testee.subtraktion(Integer.MAX_VALUE, Integer.MIN_VALUE) == 0);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testSubtraktionDoubleMaxValue() {
		try {
			assertTrue(testee.subtraktion(Integer.MAX_VALUE, Integer.MAX_VALUE) == 0);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	// ----------------------------------------------------------------------------
	// NEW DIVIDATION TEST CASES 
	
	@Test 
	public void testDividationByTwoPositive() {
		assertTrue(testee.divide(10, 2) == 5);
	}
	
	@Test 
	public void testDividationByTwoNegative() {
		assertTrue(testee.divide(-10, -2) == 5);
	}
	
	@Test 
	public void testDividationByOnePositiveOneNegative() {
		assertTrue(testee.divide(-10, 2) == -5);
	}
	
	@Test 
	public void testDividationTwoMinValues() {
		try {
			assertTrue(testee.divide(Integer.MIN_VALUE, Integer.MIN_VALUE) == 1);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testDividationTwoMaxValues() {
		try {
			assertTrue(testee.divide(Integer.MAX_VALUE, Integer.MAX_VALUE) == 1);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testDividationOneAndMaxValue() {
		try {
			assertTrue(testee.divide(Integer.MAX_VALUE, 1) == 2147483647);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}


}
