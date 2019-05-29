package day40_ArrayList;
import java.util.*;
public class CellPhone {
	String brand;//null
	double screenSize;//0.0
	String color;
	double price;
	public void call() {
		System.out.println("Calling...");
	}
	public void message() {
		System.out.println("Sending Message");
	}
	
	public void takePhoto() {
		System.out.println("Taking a Photo");
	}
	public static void main(String[] args) {
		//System.out.println(brand);
		//Above line will not work, we need object  to use brand
		//Create CellPhone object
		CellPhone cell1 =new CellPhone();
		
		System.out.println(cell1.brand);//null
		System.out.println(cell1.screenSize);//0.9
		cell1.brand = "Nikia 6300";
		cell1.screenSize= 2.0;
		cell1.color= "Silver";
		cell1.price= 76.16;
		
		
		System.out.println("Brand"+cell1 .brand);
		System.out.println("Screen size"+cell1.screenSize);
		System.out.println("Color"+cell1.color);
		System.out.println("Price"+cell1.price);
		
		
	}

}
