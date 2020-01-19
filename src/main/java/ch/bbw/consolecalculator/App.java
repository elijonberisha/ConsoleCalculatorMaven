package ch.bbw.consolecalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator calc = new Calculator();
    	int valueA = 0; 
    	int valueB = 0; 
    	
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();
        
        valueA = 10; 
        valueB = 20; 
        System.out.println("Summe " + valueA+ " + " + valueB + " = " + calc.summe(valueA, valueB));
    }
}
