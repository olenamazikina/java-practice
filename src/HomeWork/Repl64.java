package HomeWork;
import java.util.*;
public class Repl64 {
	 public static void main(String[] args){
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();    
	if (word.length()==1) {
		System.out.println(word+word+word);
	}else if (word.length()==2) {
		System.out.println(word+word);
	}else if(word.length()%2==1 && word.length()>=3) {
		System.out.println(word.charAt(word.length()/2));
	}else if(word.length()%2==0 && word.length()>=4) {
		System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
		
		
	}
		  }
}
		  