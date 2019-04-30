package day12_switch_ternary;
import java.util.*;
public class MySwith {
public static void main(String[] args) {
	 Scanner scan= new Scanner(System.in);
	System.out.println("Enter word:");
	String word=scan.next();
//	if(word.length()==1) {
//		System.out.println(word+word+word);
//	}else if(word.length()==2) {
//		System.out.println(word+word);
//	}else if (word.length()%2==1) {
//		System.out.println(word.charAt(word.length()/2));//index for charAt
//	}else if (word.length()%2==0) {
//		System.out.println(word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2));//"" should return string not numbers
//	}

		
	
	String lastHalf = word.substring(word.length()/2);
	String firstHalf= word.substring(0, word.length()/2);
	lastHalf=lastHalf.toUpperCase();
	System.out.println(lastHalf+firstHalf);
	
	
	
	}
}
	
    
	   
  