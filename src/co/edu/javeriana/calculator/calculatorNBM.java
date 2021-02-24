package co.edu.javeriana.calculator;

public interface CalculatorDSBR {
	@Override
	
	public double add(double a, double b)
	{
		return (a+b);
	}
	@Override
	public double substract (double a, double b)
	{
		return (a-b);
	}
	@Override
	public double multiply (double a, double b)
	{
		return (a*b);
	}
	@Override
	public double divide (double a, double b) throws ArithmeticException
	{
		if(b == 0)
		{
			throw new ArithmeticException("la division por 0 no es posible");
		}
		return(a/b);
	}
	@Override
	public String about()
	{
		return Authors.NBM;
	}
