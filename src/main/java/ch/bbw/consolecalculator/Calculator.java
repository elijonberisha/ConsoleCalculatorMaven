package ch.bbw.consolecalculator;

/**
 * Calculator
 * 
 * @author Berisha
 * @version 0.0.1
 * 
 * Note: I have updated all feature branches to the master branch to avoid merge conflicts
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
		return value1 * value2;
	}
	
	int multiplicatePackage(int value1, int value2) {
		return value1 * value2; 
	}
}
