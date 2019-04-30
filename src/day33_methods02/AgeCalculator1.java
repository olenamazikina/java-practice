package day33_methods02;

public class AgeCalculator1 {
	public static void main(String[] args) {
		int age=calculateAge(1994);
		System.out.println("You are "+age+" years old");
		int age2=calculateAge(1987);
		System.out.println("You are "+age+" years old");
		System.out.println(calculateAge(2025));
	}
//methd is culcylating the age 
	//print category
	//return age value age 
	//-->if  
	public static int calculateAge(int year) {
		int corentYear =2019;//2000
		int age =corentYear-year;
		//19 years
		if (age<0) {
			System.out.println("Invalid Age");
			return 0;
			
		}else if( age <= 14) {
			System.out.println("child");
			
		}else if (age>=15 && age<=25) {
			System.out.println("younger");
			
		}else if (age>=26 && age<=64) {
			System.out.println("adult");
		}else {
			System.out.println("Senior");
		
		}
		return age;//19 return
		}
		
}


