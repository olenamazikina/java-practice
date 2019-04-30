package HomeWork;
import java.util.*;
public class Repl100 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] arr= new String[5];
	for(int i=0; i<5;i++) {
		arr[i]= scan.nextLine();
		System.out.println(arr[i].substring(0,3));
	}
		/*String[] fruit = {"apple","banana","mango"};
for(String word: fruit) {
	 word = word.substring(0,3);
	 System.out.println(word); */
}
}

