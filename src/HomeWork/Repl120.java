package HomeWork;
import java.util.*;
public class Repl120 {
	 public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	    int length= 100;
	      int index = 0; 
	      for(int i=0; i<str.length; i++){
	        if(str[i].length()<length){
	          length=str[i].length();
	          index=i;
	          System.out.println(str[index]);
}
}

}
}