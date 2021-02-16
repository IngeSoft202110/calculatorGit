package co.edu.javeriana.calculator;

public interface ICalculator {
	
	public double add(double a, double b);
	public double substract (double a, double b);
	public double multiply (double a, double b);
	public double divide (double a, double b) throws ArithmeticException;
	
	public String about();

}
