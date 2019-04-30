package day30_methods02;

public class StudentAtSchool {
	public static void main(String[] args) {
	
	sleep(8);
	study("Selenium");
	study("SQL");
	study("Java");
}
	public static void study(String topic) {
		System.out.println("Student is studuing "+topic);
	}
public static void sleep(int hours) {
	System.out.println("Student has been sleping for "+hours+" hours");
	
	
	
}
}
