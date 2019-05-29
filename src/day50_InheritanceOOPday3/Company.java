package day50_InheritanceOOPday3;

public class Company {
public static void main(String[] args) {
	Employee emp= new Employee();
	FulltimeEmployee ft = new FulltimeEmployee();
	Constractor ct= new Constractor();
	
	emp.calculatePay(40,30);
	ft.calculatePay(34, 23);
	ct.calculatePay(20,30);
}
}
/*Employee
FullTimeEmployee
Contractor

calculatePay(int hours, double rate)

Employee version:
"Employee total pay: " + hours * rate

FullTimeEmployee version:
//should include 5% bonus
"FullTime employee total pay: " + total

Contractor version:
//gets $200 extra for each pay*/