package HomeWork;
import java.util.*;
public class Repl31 {
	public static void main(String[] args) {
		 int numberOfMiligrams,numberOfDrinks,lethalOverdose;
		    lethalOverdose = 10000;
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number of milligrams in drink:");
		    numberOfMiligrams = scan.nextInt();
		    numberOfDrinks = lethalOverdose/numberOfMiligrams;
		    System.out.println("It would take about "+numberOfDrinks+" drinks for a lethal overdose.");
		    
		  
		    
		    
		  }
		}