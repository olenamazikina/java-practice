package day12_switch_ternary;
import java.util.*;
public class MultipleBirts {
	public static void main(String[] args) {
		int numberOfBabies;
		System.out.println("Enter of babies");
		Scanner keyboard = new Scanner (System.in);
		numberOfBabies = keyboard.nextInt();
		switch (numberOfBabies)
		{ 
			case 1:
				System.out.println("Congratulations.");
				break;
			case 2:
				System.out.println("Wow. Twins.");
				break;
			case 3:
				System.out.println("Wow. Triplets.");
				break;
			case 4:
			case 5:
				System.out.println("Unbelievable;");
				System.out.println(numberOfBabies + " babies.");
				break;
				default:
					System.out.println("I don`t believe you. ");
					break;
		}
	}

				
}
		
	
	


