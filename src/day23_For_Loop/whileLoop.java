package day23_For_Loop;
import java.util.*;
public class whileLoop { 
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter number:");
		int number=scan.nextInt();
		for(int i=2; number<=100; i++) {//2 is first prime number
			if(number % i==0) {
				System.out.println(number+" this is not a prime number");
				return;
			}else {
			}
			}
			System.out.println(number+" this is a prime number");
		}
	}
	

	