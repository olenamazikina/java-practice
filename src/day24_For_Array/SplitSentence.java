package day24_For_Array;

public class SplitSentence {
	public static void main(String[] args) {
		int counter = 0;
		String sentence= "Java is a general-purpose computer-programming language that is concurrent,"
				+ " class-based, object-oriented, and specifically"
				+ " designed to have as few implementation dependencies as possible.";
		String [] words = sentence.split(" ");
for(String str: words) {
	if(str.equals("landuage")) {
		break;
	}
	counter++;
}
	System.out.println("Position:"+counter);
System.out.println(words[counter]);
}
}
