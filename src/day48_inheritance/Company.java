package day48_inheritance;

public class Company {
	public static void main(String[] args) {
		Employee emp1= new Employee();
		emp1.name= "Maria";
		emp1.jobTitle="teacher";
		emp1.gender='f';
		emp1.age= 22;
		
		
		Employee emp2= new Employee();
		emp2.name= "Keke";
		emp2.jobTitle="HR";
		emp2.gender='f';
		emp2.age= 25;
		
		emp1.work();
		emp2.work();
		
		emp1.eat("chicken");
		emp2.eat("salad");
		
		emp1.walk();
		emp2.walk();
		
		emp1.sleep(5);
		emp2.sleep(8);
	}

}
