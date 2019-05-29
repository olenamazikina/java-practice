package day36_methodsPractice;
import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		// declare arraylist called languages
		
		ArrayList<String> languages = new ArrayList<>();
		//add values
		languages.add("Java");
		languages.add("English");
		languages.add("Java");
		languages.add("Ukranian");
		languages.add("Italian");
		languages.add("Java");
		System.out.println(	languages.size());
		languages.add("blabla");
		System.out.println(	languages.size());
		//remove java
		languages.remove(0);
		System.out.println(	languages.toString());
	}
	
	

}
