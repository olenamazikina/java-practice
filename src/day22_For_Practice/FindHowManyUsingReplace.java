package day22_For_Practice;

public class FindHowManyUsingReplace {
	public static void main(String[] args) {
		String word = "Including webpages,images";
		//find how many e characters in the word
		//get the length of word
		//replace all e wth empty
		//get the length of word without e
		//doa minus
		
		int length1= word.length();
		word = word.replace("e",  "");
		int length2 = word.length();
		System.out.println("Length1: "+length1);
		System.out.println("Length2: "+length2);
		int count = length1-length2;
		System.out.println("Count of e: "+count);
		
	}

}
