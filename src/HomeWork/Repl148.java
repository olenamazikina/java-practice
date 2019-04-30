package HomeWork;
import java.util.Scanner;
public class Repl148 {
	 public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();
	     
	  next3(num);
	  }
	  public static void next3(int num){
	    for (int i =num+1; i<=num+3;i++){//4+1=5 and +3 times and give you 3 next nimber
	      System.out.print(i +" ");//inside loop
	    }
	    
	  } 
	  
	 
}