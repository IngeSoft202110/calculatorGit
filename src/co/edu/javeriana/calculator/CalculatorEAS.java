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

        if(b == 0){
            system.out.pritnln("Error, dividiendo por cero");

        }
        else
        	div = a/b;

        return div;
	}

	@Override
	public String about() {
		return Authors.EAS;
	}

}
