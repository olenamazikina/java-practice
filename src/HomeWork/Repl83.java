package HomeWork;
import java.util.*;
public class Repl83 {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	 String name;
	 String newguest;
	 String guestlist="";
	 do {
		 System.out.println("Please enter guest name:");
		 name=input.next();
		 guestlist=guestlist+name;
		 System.out.println("Do you want to enter new guest name?");
		 newguest=input.next();
		 if(newguest.equalsIgnoreCase("Yes")) {
			 guestlist=guestlist+", ";
		 } 
		 }
		 while(newguest.equalsIgnoreCase("Yes"));
			 System.out.println("Guest's list:"+guestlist);
		 }
     }
	  


