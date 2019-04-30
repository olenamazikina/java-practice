package day28_or_Arraysday;

import java.util.Arrays;

public class ReverseSentence {
	public static void main(String[] args) {
		String sentence= "You are very interested person";//4 space
		//split by space
		String[] arrSentence= sentence.split(" ");
		
		System.out.println("Number of words: "+ arrSentence.length);
		
		System.out.println(Arrays.toString(arrSentence));
		String reversed ="";//complete reverse a,b,c,
		for(int i = arrSentence.length-1;i>=0;i--) {//because last to the 0
		//System.out.println(arrSentence[i]);
		reversed+= arrSentence[i]+" ";
		//System.out.println(reversed);
		
	}
		reversed= reversed.trim();
System.out.println(reversed);
}
}