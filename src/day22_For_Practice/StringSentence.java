package day22_For_Practice;

public class StringSentence {
	public static void main(String[] args) {
		String sentence = "He said hi,then shr replied hi,hi guys!";
		//print letters in pairs
		//he
		// s
		//ai..
		int count=0;
		sentence.substring(0,2);
		for(int i=0;i <sentence.length()-1;i++) {
			String temp=sentence.substring(i, i+2);//letters
			
			//System.out.println(temp);
			if (temp.equals("hi")) {
				count++;
			}
			}
		//Count:3
			System.out.println(count);
		}
		
		}
		
	


