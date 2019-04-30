package day31_methods02;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {

		// add ,subtract, multiply,divide,remainder
		add(2, 5);
		subtract(4, 2);
		multiply(2, 6);
		divide(8, 2);
		remainder(10, 4);// 3+3+1
		// using scanner pass 2 numbers and operator
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation: '+','-','*','/','%'");
		String operator = scan.next();
		// using switch statement, call the mathing method to perform calculation
		switch (operator) {
		case "+":// "" because String
			add(n1, n2);
			break;
		case "-":
			subtract(n1, n2);
			break;
		case "*":
			multiply(n1, n2);
			break;
		case "/":
			divide(n1, n2);
			break;
		case "%":
			remainder(n1, n2);
			break;
		default:
			System.out.println("Invalid operator");
		}
	}

	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result : " + result);
	}

	public static void subtract(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("Result : " + result);
	}

	public static void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("Result : " + result);
	}

	public static void divide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Can not /by zero");
			return;// exit the method her. do not run rest

		}

		double result = num1 / num2;
		System.out.println("Result : " + result);
	}

	public static void remainder(double num1, double num2) {
		double result = num1 % num2;
		System.out.println("Result : " + result);
	}
}