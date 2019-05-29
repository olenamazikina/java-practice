package day50_InheritanceOOPday3;

public class Constractor extends Employee {
	@Override
	public void calculatePay(int hours,double rate) {
		double total = hours*rate+200;
		System.out.println("Contractor total pay:"+total);
	}

}
//Contractor version:
//gets $200 extra for each pay*/