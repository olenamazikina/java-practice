package day11_logical_nestedif;

public class TruthTables {
	public static void main(String[] args) {
		System.out.println("#####truth table for &&& operatop####");
		System.out.println("When true && true - result is " + (true && true));//t
		System.out.println("When true && false - result is " + (true && false));//f
		System.out.println("When false && True - result is " + (false && true));//f
		System.out.println("When false && false  - result is " + (false && false));//f
		
	System.out.println("true table for || operator ###");
	System.out.println("When true|| true - result is " +(true || true));//t
	System.out.println("When true|| false - result is " +(true || false));//t
	System.out.println("When true|| true - result is " +(false || true));//t
	System.out.println("When false || false - result is " +(false || false));//f
	
	System.out.println("");
	System.out.println("##### true table for ! (not) operator ###");
	System.out.println("When !true - result is " +(!true));
	System.out.println("When !false - result is " +(!false));
	
	
	
	
	}
}
