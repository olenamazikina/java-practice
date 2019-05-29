package day46_Static;

public class Restaurant {
	public static void main(String[] args) {
		
	
Dinner Mom = new Dinner();
Dinner kid = new Dinner();
Dinner Dad = new Dinner();




System.out.println("Total slices:"+Dinner.pizzaSlices);
System.out.println("Total slices:"+Dad.pizzaSlices);


Dad.takeASlice(2);
kid.takeASlice(3);
Mom.takeASlice(2);

}
}