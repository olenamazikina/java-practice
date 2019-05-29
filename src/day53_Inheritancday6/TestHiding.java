package day53_Inheritancday6;

public class TestHiding {
	public static void main(String[] args) {
		City city= new City(345,"London");
		Capital cap= new Capital(433, "Paris", 345677l);
		
		System.out.println(city.count);
		System.out.println(cap.count);
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
	}

}
