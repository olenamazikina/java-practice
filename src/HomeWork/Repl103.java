package HomeWork;
import java.util.*;
public class Repl103 {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    //TODO: start your code here
	    String[]temp = sentence.split("");
	    for(int i=temp.length-1; i>=0; i--){
	      reversed+=temp[i]+"";
	    }
	    
	    //End your code here. do not modify below statement
	    System.out.println(reversed);
	    
	  }
	}


