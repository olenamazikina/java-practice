package HomeWork;
import java.util.Scanner;
public class Repl85 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String add = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		 do {
	    	System.out.println("Enter Item"+count+" and its price:");
	    	item= scan.next();
	    	price=scan.nextDouble();
	    	System.out.println("Add one more item?");
	    	add = scan.next();
	    	shoppingListReport+="Item"+count+": "+item+" Price: "+price;
	    	totalPrice+=price;
	    	count++;
	    }while (add.equals("yes") && count<=10);
	    System.out.println(shoppingListReport);
	    System.out.println("Total price: "+totalPrice);
  }
}