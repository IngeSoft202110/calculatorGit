package co.edu.javeriana.calculator;

public class CalculatorCAB implements ICalculator {
    public CalculatorCAB(){super();}
    @Override
    public double add(double a, double b) {return a+b;}
    @Override
    public double substract (double a, double b){return a-b;}
    @Override
    public double multiply (double a, double b){return a*b;}
    @Override
    public double divide (double a, double b) {
		if( 0 == b)
		throw new ArithmeticException("Division by Zero");
		else
		return a/b;
	}
    @Override
    public String about(){return "Calculator implemented by CAB";}
}