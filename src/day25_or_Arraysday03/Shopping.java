package day25_or_Arraysday03;

public class Shopping {
	public static void main(String[] args) {
		String[] products = {"Timberland Shoes", "H&M Shirt","Swatch Watch Watch","Gucci Bag","Adidas socks"};
		double[] prices = {120.0, 5.99, 159.50, 3000.5, 6.99};
		int[] itemsId = {12345, 12346, 12347, 12348, 12349};
		
		//print count of products
		
		System.out.println("Products count:"+products.length);
		
		//check if products prices and productId have same count
		//loop through products and print each one in separate line
		if (products.length == prices.length && products.length==itemsId.length) {
			System.out.println("Shopping list looks good");
		}else {
			System.out.println("Something is wrong in this list ");
			return;
		}
		//loop through products and print each one in separate line
		for(String product:products) {//use loop for eachhh
			System.out.println(product);
		}
		//prices--> for loop
		for(int i = 0; i<prices.length;i++) {
			System.out.println(prices[i]);
			//itemsId--> print this in revers order using loop
			//print last itemId
			System.out.println(itemsId[itemsId.length-1]);
			for(int idx= itemsId.length-1; idx>=0; idx--) {
				System.out.println(itemsId[idx]);
				
			}
	         //print report
			//Item 1: 12345- Timberland Shoes- $120
			//
			//Total price

			System.out.println("###YOUR SHOPPING RECEIPT####");
			double totalPrice=0.0;
			for (int idx=0; idx< products.length; idx++) {
			System.out.println("Item :"+(i+1)+": "+itemsId[i]+" - "+products[i]+" - $"+prices[i]);	
			totalPrice+= prices[i]	;
			
			}
			System.out.println("Total Price: $"+totalPrice);
			//Find the most expensive item in your list and print it a sa report
			//Loop and find.Do not use Arrays class
			int max = 0;
			double maxPrice= 0;
			int maxIndex = 0;
			for(int j= 0; j<prices.length; j++) {
				if(prices[j]>maxPrice) {
					maxPrice= prices[j];
					maxIndex = j;
					//System.out.println("Item :"+(i+1)+": "+itemsId[i]+" - "+products[i]+" - $"+prices[i]);		
				}
			}
			System.out.println(itemsId[maxIndex]+" - "+products[maxIndex]+" - $"+maxPrice);
		}
	}

}
