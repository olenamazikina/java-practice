package day31_methods02;

import java.util.Arrays;

public class StringMethod {
	public static void main(String[] args) {
		countWords("Java is fun");
		//name countWords
		//return void
		//params/args: String sentence
		//countWords("Java is fun
		//"Words in this sentence [Java, is, fun]
	}
public static void countWords(String sentence) {
	String [] words= sentence.split(" ");
	System.out.println("Words in this sentence "+Arrays.deepToString(words));//number of words
	System.out.println("Number of words: "+words.length);
	
}
}
