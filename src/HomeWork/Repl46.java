package HomeWork;
import java.util.*;
public class Repl46 {
	  public static void main(String[] args) {
	    //DO NOT CHANGE
	    int num, digit1, digit2, digit3, digit4, digit5;
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter num");
	    num = scan.nextInt();
	   digit1=num/10000;
	   num=num%10000;
	    	System.out.println("Display:"+digit1);
	    	digit2=num/1000;
	    	num=num%1000;
	    	System.out.println("Display:"+digit2);
	    	digit3=num/100;
	    	num=num%100;
	    	System.out.println("Display:"+digit3);
	    	digit4=num/10;
	    	num=num%10;
	    	System.out.println("Display:"+digit4);
	    	digit5=num/1;
	    	num=num%1;
	    	System.out.println("Display:"+digit5);
	    }
}
