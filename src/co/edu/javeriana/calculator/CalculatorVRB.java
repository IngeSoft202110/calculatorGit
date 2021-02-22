package co.edu.javeriana.calculator;

public class CalculatorVRB implements ICalculator{

	@Override
	public double add(double a, double b) {
		return a+b;
	}

	@Override
	public double substract(double a, double b) {
		return a-b;
	}

	@Override
	public double multiply(double a, double b) {
		return a*b;
	}

	@Override
	public double divide(double a, double b) {
		double div = 0;
		div = a/b;
			
		if(div==Double.POSITIVE_INFINITY|| div==Double.NEGATIVE_INFINITY) {
			throw new ArithmeticException("Error, division by zero");
		}
		
		else
			return div;
	}

	@Override
	public String about() {
		return Authors.VRB;
	}

}
