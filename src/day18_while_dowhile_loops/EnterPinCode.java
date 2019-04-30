package day18_while_dowhile_loops;
import java.util.*;
public class EnterPinCode {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int secretPinCode = 1234;
	int pincode = 0;
	//keep asking a pincode  until correct oneentered
	//Access granted, select operation
	while(pincode!=secretPinCode) {
		System.out.println("Enter pincode");
		pincode= scan.nextInt();
	
}
	System.out.println("Access granted, select operation");
}


}
