package ReviewVasil;

public class StringVasil {
	public static void main(StringVasil[] args) {
		String word = "java";
		word = word.toUpperCase();
		System.out.println(word);
		//with new keyboard
		String word2 = new String("java");
		word2 = word2.toUpperCase();
		System.out.println(word);
		System.out.println(word2);
		System.out.println(word==word2);
		//equals method check value
		System.out.println(word.equals(word2));
	}

}
