package day31_methods02;

public class Authentication {
	public static void main(String[] args) {
		//name: Login
		//return type void
		//2 String args username password
		//inside the method
		//validUsername = "mentoring@cybertekschool.com"
		//validPassword= "mentoor001"
		//if userName and rassword match, print "Login Sucessful! Welcome to Okta"
		//if not : "Sing is failed!"
		//login ("mylogin","abs123");
		
		login("mentoring@cybertekschool.com","mentoor001");//if you put wrong it will give you Sing is Failed
	
	}
public static void login(String userName,String password) {
	System.out.println("Login Sucessful! Welcome to Okta");
	String validUsername = "mentoring@cybertekschool.com";
	String validPassword= "mentoor001";
	if (userName.equalsIgnoreCase(validUsername)&&password.contentEquals(validPassword)) {//because of String
	}else {
		System.out.println("Sing is failed");
	}
}
}
