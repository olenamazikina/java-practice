package HomeWork;
import java.util.Scanner;
public class Repl144 {

	
	  
	  public static void sign(int n)
	  {
		  if( n>1) {
			  System.out.println(1);
		  }else if(n<0) {
			  System.out.println(-1);
		  }else {
			  System.out.println(0);
	  }
		  
		  //your code here
	  }//end sign
	  
	  public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     int n = inp.nextInt();
	    
	    sign(n);
	  }
	}