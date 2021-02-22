package co.edu.javeriana.calculator;



public class CalculatorJDCN implements ICalculator {

	@Override
	public double add(double a, double b) {
		// Return addition
		return a + b;
	}

	@Override
	public double substract(double a, double b) {
		// Return subtraction  
		return a - b;
	}

	@Override
	public double multiply(double a, double b) {
		// Return the multiplication  
		return a * b;
	}

	@Override
	public double divide(double a, double b) throws ArithmeticException {
		// If the user is trying to divide by 0
		if (b == 0) {
			throw new ArithmeticException("No se puede dividir por cero"); 
		}
		// Otherwise return the division 
		return a / b;
	}

	@Override
	public String about() {
		String author = Authors.JDCN; 
		return author;
	}
    
}
