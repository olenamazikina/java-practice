package day20_for_loops;
import java.util.Scanner;
public class ZoombieAttack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int day=0;
	    
	    while(inhabitants>0){
	      System.out.println("Day "+day+" ["+inhabitants+"]");
	      day++;
	    inhabitants= inhabitants/2;//decrease by
	   
	    }
	    System.out.println("---- EXTINCT ----");
	  }
	}
	


