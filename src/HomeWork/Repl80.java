package HomeWork;
import java.util.Scanner;
public class Repl80 {

	  public static void main(String[] args) {
	    int freeBooks = 0;
	    Scanner scan = new Scanner(System.in);
	    boolean isPremiumCustomer = scan.nextBoolean();
	    int nbooksPurchased = scan.nextInt();
	    
	if(isPremiumCustomer==true){
	if (nbooksPurchased>=8){
	    freeBooks=2;
	}else if(nbooksPurchased<8 && nbooksPurchased>=5){
	    freeBooks = 1;
	}else{
	    freeBooks=0;
	}
	}else{ 
	if (nbooksPurchased>=12){
	   freeBooks=2;
	}else if(nbooksPurchased<=12 && nbooksPurchased>=7){
	    freeBooks=1;
	}else{
	   freeBooks=0;

	}

	   }      
	   System.out.println(freeBooks);
	  }
	
}
