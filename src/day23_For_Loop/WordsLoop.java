package day23_For_Loop;
import java.util.*;
public class WordsLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 String word="";
	        String allWords="";
	        
	        for (int i = 0;i<6;i++) {
	            System.out.println("Type the word");
	            word = scan.next();
	            if(word.contentEquals("java")) {
	                continue;
	                
	            }
	            allWords+=word+", ";
	        }
	System.out.println("All words: "+allWords);
	}
}