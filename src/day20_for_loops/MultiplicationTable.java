package day20_for_loops;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		//check if it is valid.1-10
		//if it not valid return
		//num=11
		if(num<1||num>10) {
			System.out.println("Error:Invalid input");
			//return;//stop execution here//
			System.exit(0);
			
		}
	
		//for loop to print multiplication table
			for(int i=1; i<=10;++i) {
				System.out.println(num+ " X "+i+" = "+(num*i));
		}
	}
}


