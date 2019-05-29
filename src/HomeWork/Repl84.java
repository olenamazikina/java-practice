package HomeWork;
import java.util.*;
public class Repl84 {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	  int inhabitans=scan.nextInt();
	  int day=0;
	  while(inhabitans>0) {
		  System.out.println("Day"+day+"["+inhabitans+"]");
		  day++;
		  inhabitans=inhabitans/2;
		  
	  }
	  System.out.println("-----EXTINCT-----");
	  }
	}

