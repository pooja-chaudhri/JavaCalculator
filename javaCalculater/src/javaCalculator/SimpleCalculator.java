package javaCalculator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String choice;
		
		do {
			System.out.println("Enter first number: ");
			double num1 = scan.nextDouble();
			
			System.out.println("Enter operator (+, -, *, /): ");
			 char operator = scan.next().charAt(0);
			 
			 System.out.println("Enter second number: ");
			 double num2 = scan.nextDouble(); 
			 
			 try {
				 double result = CalculatorLogic.calculate(num1,num2, operator);
				 System.out.println("result : " + result);
			 }
			 catch(Exception e) {
                 System.out.println(e.getMessage());
			 }
			 
			 System.out.println();
			 System.out.println("\nDo you want to calculate again? (yes/no): ");
			 choice = scan.next();
		}
		while(choice.equalsIgnoreCase("yes"));
		 
		scan.close();
		
		System.out.println("Thank you for using the calculator!");
		
	}

}
