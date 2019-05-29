package day39_ArrayList;
import java.util.*;
public class Cities {
	public static void main(String[] args) {
ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        cities.add("Lima");
        //For each :Print each city in same line separate by|
        for (String city:cities) {
        	System.out.print(city+" | ");
        }
        System.out.println();
	//For loop : print each city in same line separate by |
        for(int i=0;i<cities.size();i++) {
    		System.out.print(cities.get(i)+" | ");
    	}
    	System.out.println();
	
	//To string .Print each City all uppercase
	
		System.out.println(cities.toString().toUpperCase());//length()
		System.out.println(cities);
		
		//Make each city all upperCase
		String paris = cities.get(0).toUpperCase();
		System.out.println(paris);
		cities.set(0,paris);
		System.out.println(cities.get(0));
		
		cities.set(1, cities.get(1).toUpperCase());
		
		for (int j=0;j<cities.size();j++) {
			String city = cities.get(j).toUpperCase();
			cities.set(j, city);
		}
		System.out.println(cities.toString());
		
		//find the longest and shortest city
		
		
		String longestCity="";  
		 for (String city:cities) {
	        	if(city.length()>longestCity.length()) {
	        		longestCity=city;
	        	}
		 }
		 System.out.println("Longest:"+longestCity);
		 
		 String shortesCity1=cities.get(0);
		 for(String city:cities) {
			 if(city.length()<shortesCity1.length()) {
				 shortesCity1=city;
			 }
	       
		 }
		 System.out.println("Shorter:" +shortesCity1);
		 
		 ArrayList<String>citiesMoreThan6=new ArrayList<>();
		 //assign all cities that have more than6 chars to this arraylist
		 for(String ct:cities) {
			 if(ct.length()>6) {
				 citiesMoreThan6.add(ct);
			 }
		 }
		 System.out.println(citiesMoreThan6);
	}
}
	
	

