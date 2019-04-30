package day12_switch_ternary;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);                    
		//get numbers
		System.out.println("Enter first number:");
		double num1 = input.nextDouble();
		System.out.println("Enter second number:");
		double num2 = input.nextDouble();
		//get operator
		System.out.println("Select Operator: +, -, *, /, %");
		String operator = input.next();
		double result = 0.0;
		//perform calculation and display result
		if(operator.equals("+")) {
			result = num1 + num2;
		}else if (operator.equals("-")) {
			result = num1 - num2;
		}else if(operator.equals("*")) {
			result = num1 * num2;
		}else if(operator.equals("/")) {
			result = num1 / num2;
		}else if(operator.equals("%")) {
			result = num1 % num2;
		}else {
			System.out.println("Invalid operator selected: "+operator);
			return;
		}
		System.out.println("Result: "+result);
			
				
			
		}
	}


    
    
    
    

