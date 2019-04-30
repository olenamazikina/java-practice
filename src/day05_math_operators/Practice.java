package day05_math_operators;
import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		int students = 45;
		System.out.println("Students: "+students);
		students = students+5;
		System.out.println("Students: "+students);
		students = students - 2;
		System.out.println("Students: "+ students);
		int teachers = 10;
		System.out.println("Teachers:"+teachers);
		teachers -= 2;
		System.out.println("Teachers:"+teachers);
		teachers -=5;
		System.out.println("Teachers:"+teachers);
		int cars = 12;
		System.out.println("Cars:"+cars);
		cars*=2;
		System.out.println("Cars:"+cars);
		cars += cars;
		System.out.println("Cars:"+cars);
		double price = 45.50;
		int amount = 5;
		price += amount;
		System.out.println(price);
		int apples = 10;
		apples -= 3;
		System.out.println(apples);
}
}