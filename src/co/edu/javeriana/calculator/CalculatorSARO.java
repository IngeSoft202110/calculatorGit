package co.edu.javeriana.calculator;

public class CalculatorSARO{
	public CalculatorSARO(){super();}
	@Override
    public double add(double a, double b){ return a+b;}
	@Override
	public double substract (double a, double b) { return a-b;}
	@Override
	public double multiply (double a, double b) { return a*b;}
	@Override
	public double divide (double a, double b) throws ArithmeticException { return ((b==0) ? 0 : a/b);}
	@Override
	public String about(){Authors.SARO}
}

