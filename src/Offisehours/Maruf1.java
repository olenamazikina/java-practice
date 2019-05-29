package Offisehours;

public class Maruf1 {
	public static void main(String[] args) {
		//when you use constraction certain actions are 
		//begin taken during the process of creating 
		//the object
		Person john = new Person("01/01/2000");
		john.setFirstName("John");
		john.setLastName("Doe");
		//john.setBirthday("01/01/2000");it is not need anymore
		
		System.out.println(john.getFirstName());
		System.out.println(john.getLastName());
	System.out.println(john.getBirthday());
	
	john.setLastName("Smith");
	//john.setBirthday("02/02/2000");this line will not work because we dont have setterbirsday.now we have constractor
	System.out.println(john.getBirthday());

	
	///constractor has only one variables (01/01/2000) no more
	}

}
