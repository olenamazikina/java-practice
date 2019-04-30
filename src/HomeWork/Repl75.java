package HomeWork;
import java.util.Scanner;
public class Repl75 {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    if(word.startsWith("X")&&word.startsWith("x")||
	    		word.endsWith("X")&&word.endsWith("x")){
	    	System.out.println(word.substring(1,word.length()-1));
	    }else if(word.startsWith("X")||word.endsWith("x")) {
	    	System.out.println(word.substring(1));
	    	 }else if(word.endsWith("X")||word.endsWith("x")) {
	    		 System.out.println(word.substring(0,word.length()-1));
	    	 }else {
	    		 System.out.println(word);
	    	 }

	    	}

	    	}
	   
	    
