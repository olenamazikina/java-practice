package day09_stringequals_conditionals;
import java.util.Scanner;
public class Canada {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is capital of Canada?");
		String capital = keyboard.nextLine();
		//Check if the answer is correct
		if (capital.equalsIgnoreCase("Ottawa")){  
		//if(capital.equals( "Ottawa")) {
			System.out.print("Your ansver is correct!");
				
		}else {
			System.out.println("Your answer is incorrect! " +capital+  " is not capital of Canada ");
		}
	   	
	}
	
}
	
