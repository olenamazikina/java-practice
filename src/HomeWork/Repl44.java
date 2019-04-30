package HomeWork;
import java.util.*;
public class Repl44 {
	  public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		    
		    
		    int house = s.nextInt();
		    int player = s.nextInt();
		    
		    //your code here
		    if (house > 21 || player >21){
		       System.out.println("bust");
		   }else if (house>player){
		       System.out.println("player loss");
		   }else if (player==house){
		       System.out.println("its a tie");
		   }else{
		       System.out.println("player wins");

		      }

		  }

		}

		 

		   

		  

