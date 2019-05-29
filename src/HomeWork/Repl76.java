 package HomeWork;
 import java.util.*;
public class Repl76 {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
	    if(start.equalsIgnoreCase(end)){
	    	System.out.println("Found"+end);
	    	return;
	    }else {
	    	while(!start.equalsIgnoreCase(end)) {
	    	switch(start) {
	    	case ("A"):
	    		System.out.println("rigth");
	    	start="B";
	    	break;
	    	case ("B"):
	    		System.out.println("down");
	    	start="C";
	    	break;
	    	case ("C"):
	    		System.out.println("left");
	    	start="D";
	    	break;
	    	case ("D"):
	    		System.out.println("up");
	    	start="A";
	    	break;
	    	}
	    	if(!start.equals(end)) 
	    		System.out.println(">");
	    	}
	    	System.out.println(": "+end+" found");
	    	}
	    		
	  }
}
	    