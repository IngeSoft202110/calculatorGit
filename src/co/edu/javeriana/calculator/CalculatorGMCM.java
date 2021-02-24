package co.edu.javeriana.calculator;

public class CalculatorGMCM implements ICalculator{

	@Override
	public double add(double a, double b) {
		return (a+b); //Return add
	}

	@Override
	public double substract(double a, double b) {
		return (a-b); //Return substract
	}

	@Override
	public double multiply(double a, double b) {
		return (a*b); //Return Multiply
	}

	@Override
	public double divide(double a, double b) throws ArithmeticException {
		if(b == 0) {
			throw new ArithmeticException("You can´t divide by zero "); //Exception 
		}
		return (a/b);//Return divide if is valid 
	}

	@Override
	public String about() {
		return "Calculator implemented by <<" + Authors.GMCM + ">>"; //Return author name 
	}
	
	

}
