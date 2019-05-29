package day48_inheritance;
         //Employee IS -A     Person
public class Employee extends Person{
String jobTitle;
 public void work() {
	 System.out.println(name+" is working as "+jobTitle);
 }
 
}
