package day12_switch_ternary;
import java.util.*;
public class WarmUpNumber2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the time:\n(In 24 hour format)");
		byte hour = scan.nextByte();
		System.out.println("Are you sleepy?");
		boolean isSleepy = scan.nextBoolean();
		if (hour >= 7 && hour <12) {
			System.out.println("Go back to sleep!");
		}
		if (hour >= 7 && hour <= 12) {
			System.out.println("Good morning!!");
		}else if (hour >= 12 && hour <= 16) {
		System.out.println("Good afternoon!");
		}else if (hour >16 && hour >=24) {
			System.out.println("Good evening!");
		}else if (hour > 0 && hour < 7 ) {
			System.out.println("Go back to sleep!");
		}else {
			System.out.println("Invalid Time!");
		}
		
		
	}

}
