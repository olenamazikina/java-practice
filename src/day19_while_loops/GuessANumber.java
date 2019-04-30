package day19_while_loops;
import java.util.*;
public class GuessANumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		Random random = new Random();
		int secretNumber = random.nextInt(101);//is used to generaterandom numbers
		System.out.println("Enter your guess:");
		//this willgive
		int guess = scan.nextInt();
		int count =1;
		do {
			count++;
			if(guess < secretNumber) {
				System.out.println("Your number is too small");
			}else if (guess>secretNumber) 
				System.out.println("Your number is too large");
			guess = scan.nextInt();
			
		}while(guess!=secretNumber);
		System.out.println("Bingo,Congratulation,you won");
		System.out.println("You guess it from"+count+"tries");
		}
	}


/*Scanner scan = new Scanner(System.in); 
System.out.println("##Welcome to guess a number game##");	
int secretNumber = 83;
int guessNumber;
do {
	System.out.println("Guees number: ");
	guessNumber=scan.nextInt();
	if(guessNumber < secretNumber) {
		System.out.println("your number is too small");
	}else if (guessNumber>secretNumber) {
		System.out.println("Your number is too large");
	}
}while(guessNumber!=secretNumber);
System.out.println("Bingo,Congratulation,you won");
}
}


*/