package HomeWork;
import java.util.*;
public class Repl74 {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			String message = scan.nextLine();
			//Sender:<Mike Smith>.From number:[202-123-3456].Message:{I love programming and problrm solving}
String sender= message.substring(message.indexOf("<"+1,message.indexOf(">")));
System.out.println("Sender:"+sender);
String phoneNumber= message.substring(message.indexOf("[")+1,message.indexOf("]"));
System.out.println("Phone number:"+phoneNumber);
	String messageBody=message.substring(message.indexOf("{")+1,message.indexOf("}"));
	System.out.println("Message body:"+messageBody);
	  }
	  
}