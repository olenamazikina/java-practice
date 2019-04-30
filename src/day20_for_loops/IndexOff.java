package day20_for_loops;

public class IndexOff { 
	public static void main(String[] args) {
		String word = "amazon";//if you put upperCase 'A' sestem output second ' a 'because it not in req.
		//word =word.toLowerCase();
		char letter = 'a';
		int index = -1;
		//using for loop- look for the letter 
		//if it is a match assign value to index
		//exit for loop 
		//print value of index
		for(int i =0; i<word.length();i++) {
			if(word.charAt(i)==letter) {
				index = i;
				break;
				
			}
		}
		System.out.println("Index: "+index);
	}

}
