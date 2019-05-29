package day50_InheritanceOOPday3;

public class FulltimeEmployee extends Employee{

	@Override//check if method is really override

	public void calculatePay(int hours, double rate) {
		double total= (hours*rate)*1.05;
		System.out.println("FullTimeEmployee total pay :"+total);
	}
}


//FullTimeEmployee version:
//should include 5% bonus
//"FullTime employee total pay: " + total
