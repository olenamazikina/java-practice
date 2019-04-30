package day05_math_operators;

public class CompanyWarmUp {
	public static void main (String[] args) {
		String companyName ="Facebook";
		String address = "Silicon Valley,CA";
		int numberOfEmployees = 1000;
		long revenue = 4000000L;
		boolean isTechCompany = true;
		System.out.println("Company name is " + companyName);
		System.out.println("Address is " + address);
		System.out.println("Number of employees is " + numberOfEmployees);
		System.out.println("Annual revenue is "+ revenue);
		System.out.println("Is it tech company? - "+isTechCompany);
		
		
		String aboutCompany = "Company " +companyName +" is located in "+ address +"\n and " +numberOfEmployees;
		System.out.println(aboutCompany);
	}

}
