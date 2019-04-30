package day35_methodsPractice;

public class EncryptionFunV2 {
	public static void main(String[] args) {
		System.out.println(encryptChar('z'));
		System.out.println(encryptChar('m'));
		//System.out.println(encryptSentence("Java is fun"));
		
		String normal ="sanday";
		String encrypted = encryptWord(normal);
		System.out.println("normal: "+normal+"\n"+"encrypted: "+encrypted);
		System.out.println(encryptSentence("java is fun"));
		System.out.println(encryptSentence("i love java"));//only lowerCase because alphabet
	}
public static char encryptChar(char ch) {
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String encrypted ="zyxwvutsrqponmlkjihgfedcba";
	//return encryptChar(alphabet.indexOf(ch));
	int i = alphabet.indexOf(ch);
	char ret= encrypted.charAt(i);
	return ret;
}

public static String encryptWord(String word) {
	String cyphered= "";
	for( int i=0; i<word.length();i++) {
	cyphered+= encryptChar(word.charAt(i));
	}
   return cyphered;
}
public static String encryptSentence(String sentence) {
	String [] wordsArr= sentence.split(" ");
	String retValue = " ";
	for(String word:wordsArr) {
		retValue+=encryptWord(word)+" ";
		
	}
	return retValue.trim();
	
}
}





//1.encryptChar
//return type char
//param char
//takes char and returns encrupted version
//encryptChar('a'==>'z')
//
//2.encryptWord
//return type String 
//param String
//take a string and returns encrypt version for the whole 

//3.encryptSentence
//return type String 
//param String sentence
//Split sentence by space and call encryptWord and
//return encrepted sentence