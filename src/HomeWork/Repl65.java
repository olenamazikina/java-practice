package HomeWork;
import java.util.*;
public class Repl65 {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
if(word.length()%2==1 && word.length()>=5) {
	System.out.println(word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2)+""
+word.charAt(word.length()/2-1));
		    }else {
		    	System.out.println("Invalid");
		    }
}
}