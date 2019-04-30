package day16_strings_manipulation;

public class isEmpty {
	public static void main(String[] args) {
		String userName = "";
		String password = "";//true
		System.out.println(userName.isEmpty());
		if(userName.isEmpty()){
			System.out.println("Username field cannot be empty");
		}else {
			System.out.println("Username is not empty");
		}
		if(userName.isEmpty() || password.isEmpty())	{
			System.out.println("Username or password cannot be empty");
		}else {
			System.out.println("Username or password is not  empty");
			
		}
	
	//command: CTRL +SHIFT+F
	
	
	
}
			}
		
	