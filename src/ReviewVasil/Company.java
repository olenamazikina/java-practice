package ReviewVasil;
import java.util.*;
public class Company {
	public static void main(String[] args) {
		Employee employee1 =new Employee();
		employee1.firstName= "Pavel";
		employee1.lastName= "Babayan";
		employee1.printInfo();
		
		//second employee
		Employee employee2 =new Employee();
		employee2.firstName= "Murad";
		//Employee [] it_department= new Employee[2];
		//type [name = new type[size];		
		//Employee [] it_department= {employee1, employee2};
		
		employee1.generateEmail();
		employee1.printEmail();
		employee1.setEmail("1234@ ");
	}

}
