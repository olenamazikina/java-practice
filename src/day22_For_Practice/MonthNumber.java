package day22_For_Practice;
import java.util.*;
public class MonthNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month;//declare month variable
		int count=0;
		do {
			System.out.println("Enter the month:");
			 month = scan.nextInt();
			
		}while(month>=1 && month <=12);
	
	System.out.println("Invalid month - "+month);
	}
}