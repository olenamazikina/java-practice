package HomeWork;
import java.util.*;
public class Repl34 {
public static void main(String[] args) {
	 int numberOfCandies,numberOfGumballs;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number of coupons:");
	    int numberOfCoupons = scan.nextInt();
	    if (numberOfCoupons<3){
	    System.out.println("Not enough coupons");
	    }else{
	      numberOfCandies = numberOfCoupons/10;
	      System.out.println("Number of Candies: " + numberOfCandies);
	      numberOfGumballs = numberOfCoupons%10/3;
	      System.out.println("Number of Gumballs: " + numberOfGumballs);
	    }
	    
	    
	    
	    
	  }
	}