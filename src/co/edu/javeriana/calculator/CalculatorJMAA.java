package co.edu.javeriana.calculator;

public class CalculatorJMAA implements ICalculator {
	
	@Override
	public double add(double a, double b){
		
		//Regresa la suma
		return a+b;
	}

	@Override
	public double substract (double a, double b){
		
		//Regresa la resta
		return a-b;
	}

	@Override
	public double multiply (double a, double b){

		//Regresa la multiplicacion
		return a*b;
	}

	@Override
	public double divide (double a, double b) throws ArithmeticException
	{
		//Excepción división por 0
		if (b == 0){
			throw new ArithmeticException ("Error, no se puede dividir por 0") ;
		}

		//Regresa la division
		return a/b;
	}
	
	public String about(){
		//Regresa el autor
		return Authors.JMAA;	
	}
}