package Calculator_Package;

import java.util.Scanner;

public class Calculator {

	public static final int ERROR_NUM = -99999999;
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		double number1 = 0, number2 = 0;
		String operation = "";
		
		try { // to Handle Enter Numbers
		System.out.println("Enter Number1: ");
		number1 = input.nextDouble();
		System.out.println("Enter Number2: ");
		number2 = input.nextDouble();
		}
		catch(Exception e) {
			System.out.println("Please Enter Numbers");
			return;
		}
		
		
		System.out.println("Enter The Operation(+ , - , * , /): ");
		operation = input.next();
		
		if(operation.equals("+")) {
			System.out.println("The Output = " + Add_Operation(number1, number2));
		}
		else if(operation.equals("-")) {
			System.out.println("The Output = " + Subtract_Operation(number1, number2));			
		}
		else if(operation.equals("*")) {
			System.out.println("The Output = " + Multiply_Operation(number1, number2));						
		}
		else if(operation.equals("/")) {
			if(Divide_Operation(number1, number2) == ERROR_NUM)System.out.println("Can't Divide by 0");
			else System.out.println("The Output = " + Divide_Operation(number1, number2));
		}
		else {
			System.out.println("Invalid Operation");
		}
		
		
	}
	
	
	
	
	protected static double Add_Operation(double num1, double num2) {
		return num1 + num2;
	}
	
	protected static double Subtract_Operation(double num1, double num2) {
		return num1 - num2;
	}
	
	protected static double Multiply_Operation(double num1, double num2) {
		return num1 * num2;
	}
	
	protected static double Divide_Operation(double num1, double num2) {
		if(num2 == 0) return ERROR_NUM;
		return num1 / num2;
	}
}
