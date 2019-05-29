package ReviewVasil;
//import java.util.*;
public class Employee {
//public static void main(String[] args) {
	
	//insted method
	String firstName;
	String lastName;
	String title ;
	String email;
	int employee_id;
	int age;
	float hourlyRate;
	char gender;
	boolean isInsured;
	String[] titles = {"Developer", "Scrum master", "SDET", "PO", "QA Analyst", "BA", "HR"};
	
	public void printInfo() {
		System.out.println("First name: " + firstName + ", Last name: " + lastName + ", Employee id: " + employee_id
				+ ", Age: " + age + ", Hourly rate: " + hourlyRate + "$, Gender: " + gender + ", Insured? " + isInsured
				+ ", Title: " + title+", Email: "+email);	
	}
	//lets create method that will generate an email for emloyee
	//use firstName lastName@gmail.com as a template
	//your method suppose to accept object of employee as a parameter (Employee)
	//and this method will have a String as return type
	
	
	public String generateEmail() {
		String newEmail= firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@gmail.com";
		email= newEmail;
		return newEmail;
		
	}
	public void setEmail(String e) {
		//lets check if email is valid before us changing it
		if(email.contains("@")) {
		email=e;
	}else{
		System.out.println("Invalid email!");
	}
	}
	public void printEmail() {
		System.out.println("Email of "+firstName+" "+lastName+" : "+email);
	}
}

