package day18_while_dowhile_loops;
import java.util.*;
public class poiuyt {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	int itemPrice, quarters,dimes,nickels;
	System.out.println("Enter price in cents: ");
	itemPrice = scan.nextInt();
	if(itemPrice > 100) {
		System.out.println("Invalid price!");
	}else if(itemPrice <25) {
		System.out.println("Invalid price!");
	}else if(itemPrice%5==0) {
		quarters =(100 - itemPrice)/25;
	    dimes = (100-itemPrice)%25/10;
	    nickels = (100-itemPrice)%25%10/5;
	    System.out.println("Your change is "+quarters+"quaters,"+dimes+" dimes,"+" and "+nickels+"nickels.");
	}
		
		
System.out.println("Invalid price");

		}
		
	}


