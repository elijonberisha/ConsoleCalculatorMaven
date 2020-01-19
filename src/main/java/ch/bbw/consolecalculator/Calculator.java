package ch.bbw.consolecalculator;

/**
 * Calculator
 * 
 * @author Berisha
 * @version 0.0.1
 */

public class Calculator {
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}
	
	public int subtraktion(int value1, int value2) {
		return value1 - value2; 
	}

	public double divide(int value1, int value2) {
		return value1 / value2;
	}
	
	protected int multiplicate(int value1, int value2) {
		return 0;
	}
}
