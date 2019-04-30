package day20_for_loops;
import java.util.Scanner;
public class Replace {
	public static void main(String[] args) {
		//for any string replace  d with f
		Scanner spoon = new Scanner(System.in);
		String str =  spoon.nextLine();
		str = str.substring(0,1).toUpperCase()+ str.substring(3);
//		str = str.replace(str.charAt(1),'f');
	System.out.println(str);
		
	}

}
