package HomeWork;
import java.util.Scanner;
public class Repl73 {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    String s = email.substring(0,1);
	    String l=email.substring(email.indexOf("_")+1,email.indexOf("_")+2);
	    System.out.println("First name: "+s.toUpperCase()+email.substring(1,email.indexOf("_")));
	    System.out.println("Last name: "+l.toUpperCase()+email.substring(email.indexOf("_")+2,
	    email.indexOf("@")));
	    System.out.println("Domain: "+ email.substring(email.indexOf("@")+1,
	    email.indexOf(".")));
	    System.out.println("Top-Level Domain: "+ email.substring(email.indexOf(".")+1));

	   

	  }

	}
	    
	    
	  
