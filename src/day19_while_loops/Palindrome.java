package day19_while_loops;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test: "); 
		String word =scan.next();
		String reversed = "";
		
		//loop through word in reverse order and
		//cincentanate each character to resersed string
		//compare if word and reversed are equal
	int idx = word.length()-1;	
	while(idx>=0) {
		reversed = reversed +word.charAt(idx);
		idx--;
		
	}
	System.out.println(reversed);
	}

}
