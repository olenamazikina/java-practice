package HomeWork;
import java.util.*;
public class Repl99 {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for(i =1; i<=n; i++) {
			for(j=1; j>=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	}

}