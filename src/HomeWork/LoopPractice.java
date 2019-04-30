package HomeWork;
import java.util.*;
public class LoopPractice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("###Welcome to our Store####\n");
		System.out.println("How many items do  you have?");
		int itemCount = input.nextInt();
		//declare variable for items and price for them
		String allItems= "";
		double totalPrice= 0;
		for(int i =1; i<=itemCount; i++) {
		System.out.println("What is item"+i+"?");
		String item = input.next();
	
		System.out.println("How much is "+item+"?");
		double price =input.nextDouble();
		
		if(i==itemCount) {
		allItems= allItems+item;
		}else {
			allItems= allItems+item+",";
		}
		totalPrice= totalPrice+price;
}
		System.out.println("Your items: "+allItems);
		System.out.println("Total Price: $"+totalPrice);
		
	}

}
