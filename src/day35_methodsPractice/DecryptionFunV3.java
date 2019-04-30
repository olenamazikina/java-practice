package day35_methodsPractice;

public class DecryptionFunV3 {
	public static void main(String[] args) {
		System.out.println(decryptSentence("dllwvm hkllm"));
		System.out.println(decryptSentence("glwzb xozhh rh ufm"));
		
	}
	public static char decryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String decrypted ="zyxwvutsrqponmlkjihgfedcba";
		//return encryptChar(alphabet.indexOf(ch));
		int i = alphabet.indexOf(ch);
		char ret= decrypted.charAt(i);
		return ret;
		}

		public static String decryptWord(String word) {
			String cyphered= "";
			for( int i=0; i<word.length();i++) {
			cyphered+=decryptChar(word.charAt(i));
			}
		   return cyphered;
		}
		public static String decryptSentence(String sentence) {
			String [] wordsArr= sentence.split(" ");
			String retValue = " ";
			for(String word:wordsArr) {
				retValue+=decryptWord(word)+" ";
				
			}
			return retValue.trim();
			
		}
		}
	
	

	  