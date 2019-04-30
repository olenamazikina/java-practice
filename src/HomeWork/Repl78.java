package HomeWork;
import java.util.*;
public class Repl78 {
 public static void main(String[] args) {
    //DO NOT CHANGE
    double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
    //WRITE YOUR CODE HERE
    System.out.println("Enter yor name.");
    name =scan.next();
    System.out.println("Do you have a US driver license?");
    String license= scan.next();
    if(license.equals("No")) {
    	System.out.println("Invalid Data!");
    	System.exit(0);
    	System.out.println("Enter your zip code:");
    	int zipCode=0;
    	zipCode=scan.nextInt();
    	if(zipCode==20910 || zipCode == 20740) {
    		premium+=60;
    	}else if(zipCode ==22102 || zipCode == 22103) {
    		premium+=30;
    	}else {
    		premium+=50;
    	}	
    		System.out.println("Is this vehicle Owned, Financed, or Leased?");
    		if(vehicleOwnership.contentEquals("Owned")) {
    			premium+=10;
    		}else {
    			premium+=20;
    			System.out.println("How is this vehicle primarily used?");
    			vehicleUsage=scan.next();
    			if(vehicleUsage.equals("Bisiness")) {
    				premium+=50;
    			}else if(vehicleUsage.equals("Pleasure")) {
    				premium+=10;
    			}else if(vehicleUsage.equals("Commute")) {
    				premium +=20;
    				System.out.println( );
    					
    				}
    			}
    			
    			
    		
    	
    	}
    }
    )
}
}