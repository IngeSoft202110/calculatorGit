package co.edu.javeriana.calculator;

public class CalculatorJSGV implements ICalculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws ArithmeticException {
        double division = 0.0;
        try {
            division = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error" + e.getMessage());
        } finally {
            return division;
        }
    }

    @Override
    public String about() {
        return Authors.JSGV;
    }

}
