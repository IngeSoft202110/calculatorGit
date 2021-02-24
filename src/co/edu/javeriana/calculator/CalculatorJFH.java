package co.edu.javeriana.calculator;

public class CalculatorJFH implements ICalculator {
    
    @Override
	public double add(double a, double b){
		return a+b;
	}

	@Override
	public double substract (double a, double b){
		return a-b;
	}

	@Override
	public double multiply (double a, double b){
		return a*b;
	}

	@Override
	public double divide (double a, double b) throws ArithmeticException
	{
		if (b == 0){
			throw new ArithmeticException ("Division por 0") ;
		}
		return a/b;
	}
	
	public String about(){
		return Authors.JFH;	
	}
}
