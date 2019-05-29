package day40_ArrayList;

public class MyContact {
	public static void main(String[] args) {
		//create Contact object
		Contact contact1= new Contact();
		contact1.name ="Paola Soto";
		contact1.phoneNumber= "(202) 333 - 4444";
		contact1.email= "paoldety@mail.com";
		
		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();
		
		Contact aron= new Contact();
		aron.name = "Aron Derr";
		aron.phoneNumber= "571-234-56078";
	    aron.email="aron23@gmail.com";
	    
	    
	    
	    System.out.println("Name: " + aron.name);
		System.out.println("PhoneNumber: " + aron.phoneNumber);
		System.out.println("Email: " + aron.email);
		
		
	aron.call();
	aron.sendMessage();
	aron.sendEmail();
	}

}
