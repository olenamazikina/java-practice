package day12_switch_ternary;
import java.util.*;
public class ClassWeather {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How is the weather outside?");
		String weather = scan.next();//toLowerCase();
		switch(weather) {
		case"sanny":
		System.out.println("Go to park");
		System.out.println("Code Java");
		case"hot":
			System.out.println("Go swimming");
			System.out.println("Code Java");
			break;
		case"windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case"rainy":
			System.out.println("Go shopping");
			System.out.println("Code Java");
			break;
		case"Snow":
			System.out.println("Chain your types");
			System.out.println("Go skiing");
			System.out.println("Code Java");
			break;
			default:
	System.out.println("Code Java in any other weather");
	break;
			
		}
		System.out.println("#####END OF PROGRAMM###");
		}

}
