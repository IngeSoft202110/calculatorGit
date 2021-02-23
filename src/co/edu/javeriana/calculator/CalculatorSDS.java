package co.edu.javeriana.calculator;

public class CalculatorSDS implements ICalculator {
	
	@Override
	public double add(double a, double b){
		//return suma
		return a+b;
	}

	@Override
	public double substract (double a, double b){
		//return resta
		return a-b;
	}

	@Override
	public double multiply (double a, double b){
		//return multiplicacion
		return a*b;
	}

	@Override
	public double divide (double a, double b) throws ArithmeticException
	{
		//Excepci�n divisi�n por 0
		if (b == 0){
			throw new ArithmeticException ("Error, divisi�n por 0") ;
		}

		//Retorno de la divisi�nn
		return a/b;
	}
	
	public String about(){
		//Retorna el autor de la calculadora
		return Authors.SDS;	
	}
}
