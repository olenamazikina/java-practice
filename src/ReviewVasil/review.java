package ReviewVasil;
import java.util.*;
public class review {
	public static void main(StringVasil[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		// int age =21;
		 if (age>0 && age<21) {
			 //if condition   is true 
			 System.out.println("Under age!");
		 }else if(age<1) {
			 System.out.println("Invalid age");
		 }else {
			 //if condition is false
			 System.out.println("You are fine!");
		 }
	}

}
