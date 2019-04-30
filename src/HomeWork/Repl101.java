package HomeWork;
import java.util.*;
public class Repl101 {

	  public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    //TODO: Write your code below
	    
	    for(String letters:words){
	      System.out.println(""+letters.charAt(0)+letters.charAt(letters.length()-1));
	    }
	  }
	}

