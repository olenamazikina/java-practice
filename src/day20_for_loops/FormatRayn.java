package day20_for_loops;
import java.util.*;
public class FormatRayn {
	public static void main(String[] args) {
		//take three words off the keyboard display
		//the three words with two space between them and none on the outside
		//imput is three words with any number of spacei.e."  these three words
		//output "these three words
		Scanner space = new Scanner(System.in);
		String str = space.nextLine().trim();
		str = str.replace("  ","  ");
		System.out.println(str);
		
		
	}

}
