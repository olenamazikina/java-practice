package HomeWork;
import java.util.Scanner;
public class Repl72 {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    if(email.contains("_")) {
	    	System.out.println(email.substring(email.indexOf("_")+1,
	    			email.indexOf("@"))+
	  email.substring((0),email.indexOf("_"))+email.substring(email.indexOf("@")));
	    }else {
	    	 System.out.println(email);
	    }
	    
	    
	 
}
}
//mike_tyson@gmail.com
//output: tyson_mike@gmail.com
