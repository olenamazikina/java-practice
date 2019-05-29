package Offisehours;

public class Person {
	private String firstName;
	private String lastName;
	private String birthday;
	
	//the constructor takes an argument
	//in the body of the constructor,we are assigning 
	//the argument to birthday
	//from now on,whenever
	public Person (String bDay) {
		System.out.println("Constructing");
		birthday=bDay;
	}
	
	

	public String toString() {
		return "Maruf [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	//will not have 
//	public void setBirthday(String birthday) {
	//	this.birthday = birthday;
	}
	


