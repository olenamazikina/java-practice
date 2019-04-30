package day19_while_loops;

public class PrintLetters {
	public static void main(String[] args) {
		String word = "Amazon";
		           //  012345 Index
		          //   123456
		//print each character one by one in separate lines
		int idx = 0;
		System.out.println(word.charAt(idx));
	while(idx<word.length()){
		System.out.println(word.charAt(idx));//(idx++) same
		idx++;
	}
		int idx2 = word.length()-1;//5
		while(idx2 >=0) {
			System.out.println(word.charAt(idx2));
			idx2--;//012345->Amazon
		}
	//print each charecter in reverse order
	}

}



//1 condition true ,idx = 0 A
//2 true idx = 1 m
/*System.out.println(word.charAt(0));
//System.out.println(word.charAt(idx));
idx++;
System.out.println(word.charAt(idx));

idx++;
System.out.println(word.charAt(idx));

idx++;
System.out.println(word.charAt(idx));

idx++;
System.out.println(word.charAt(idx));

idx++;*/