package day21_for_practice;
import java.util.*;
public class NumberMoreTnan100 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int sum=0;
	////int sumOfSums=0;
	do {
	System.out.println("Enter two numbers:");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	//	//sumOfSums += sum;
	sum= num1+num2;
	}while(sum<=100); 
	
	System.out.println("Good Numbers!");
	System.out.println("Program Ends!");
}
}


		