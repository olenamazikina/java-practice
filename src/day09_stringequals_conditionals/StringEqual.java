package day09_stringequals_conditionals;

import java.util.Scanner;

public class StringEqual {
	public static void main(String[] args) {
	String s1, s2;
	System.out.println("Enter two lines of text: ");
	Scanner keyboard = new Scanner(System.in);
	s1 = keyboard.nextLine();
	s2 = keyboard.nextLine();
	if (s1.equals(s2))
		System.out.println("The two lines are equal.");
	else 
		System.out.println("The two lines are not eaqul.");
	if (s2.equals(s1))
		System.out.println("The two linesJava  are equal.");
		else
			System.out.println("The two lines are not equal.");
	if (s1.equalsIgnoreCase(s2))
		System.out.println("But the lines are equal, ignoring case.");
	else
		System.out.println("Lines are not equal, ignoring case");/////////for me
	
	
   }
	}
