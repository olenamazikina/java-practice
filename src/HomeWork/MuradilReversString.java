package HomeWork;

public class MuradilReversString {
	public static void main(String[] args) {
		           //0123456
		String today="tuesday";
		//print tues
		//printday
		String t = today.substring(0,4);
		String d = today.substring(4);
		System.out.println(t+"\n"+d);
		System.out.println(today.substring(2,3));//e
		System.out.println(today.substring(4,5));//d
		
		int a=4;
		System.out.println(today.charAt(a));//d
	
		for(int i=0; i<=today.length();i++) {
			System.out.println(today.charAt(i));
			System.out.println(today.substring(i));//(i,i+1));
	           //0123456
			  //"tuesday";
			for(int j= today.length()-1;j>=0;j--) {
				System.out.print(today.charAt(j)+" ");
			}
			for(int m= today.length()-1;m>=0;m--) {
				System.out.println(today.substring(m,m+1)+" ");
			}
			System.out.println();
				//assign to variable
				String word= "beef";
				String reversed="";
				for(int r= word.length()-1;r>=0; r-- ) {
					//System.out.print(word.charAt(r));
					//read character and add to reversed
					reversed+=word.charAt(r);
				}
			System.out.println(reversed);
			
			//
			if (reversed.equalsIgnoreCase(word)) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not palindrome");
			}
		}
	}
}

