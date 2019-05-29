package ReviewVasil;

public class Arraysession {
	public static void main(String[] args) {
		System.out.println(milesToKms(10));
		System.out.println(milesToKms(70));
		double km= milesToKms(45);
		System.out.println(km);////ask
		System.out.println(multiply(4,8));
		//double kmValue= multiply(miles,1.069);
		//return kmValue;
		//converter
		double litersValue= gallonsToLiters(15);
		
	}
public static double milesToKms(double miles) {
	double kmValue=miles*1.609;
	return kmValue;
}
public static double multiply(double num1, double num2)	{
	return num1*num2;
}
public static double gallonsToLiters(double gallons){
	//local varieble -variablse declare in method
	double litersValue = multiply(gallons,3.785);
	return litersValue;
	
}
}
