package HomeWork;
import java.util.*;
public class Repl115{
		public static void main(String[] args) 
		{
		  Scanner input = new Scanner(System.in);
			String[] words = new String[5];
			for(int i = 0; i < 5;  i++) {
			  
			  words[i] = input.nextLine();
			}
	int longest=0;
	String longestWord ="";
	 //write your code below
	 for(String word:words){
	if(word.length() > longest){
	longest=word.length();
	 longestWord=word;
	     }
	  }
	 System.out.println(longestWord);       
	 }

	}
	    

