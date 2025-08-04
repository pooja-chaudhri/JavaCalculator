package javaCalculator;

public class CalculatorLogic {

	public static double calculate(double a, double b, char op) throws Exception {
		switch (op) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				throw new ArithmeticException("Divide by zero");
			return a / b;
		default:
			throw new IllegalArgumentException("Invalid operator");
		}
	}

}
