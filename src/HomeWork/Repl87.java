package HomeWork;
import java.util.*;
public class Repl87{
		    public static void main(String[] args) {
	    boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    if (word.length()<4){
	        exists=false;
	      }else if ("java".equals(word.substring(0, 4)) || "java".equals(word.substring(1,5))){
	      exists=true;
	      }
	    System.out.println(exists);

	  }

	  }
	  
