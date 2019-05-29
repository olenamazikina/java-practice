package day46_Static;

public class Campus {
	String  city;
	
	static {
		System.out.println("static block");
	//country ="USA";
	}

	static {
		System.out.println("static block 2");
		//country = "Canada";	
		}
public Campus (String city) {
	System.out.println("Constractor");
	this.city = city;
	
}
public static void campusInfo() {
	System.out.println("Welcome to campus!");
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}
