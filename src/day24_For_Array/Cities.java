package day24_For_Array;

public class Cities {
	public static void main(String[] args) {
		String[] cities = {"Washington D.C.", "Kiev","Annandale","Moscow","Instambul","Baku","Miami","Silver Spring","McLean"};
		System.out.println(cities.length);
		//Task print all the cities with starts letter L
		for(int  i= 0; i< cities.length; i++) {
			if (cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
		//same think with for each loop
		for(String city: cities) {
			if (city.startsWith("M")) {
				System.out.println(city);
			}
		}
		
	}
	
	
	

}
 