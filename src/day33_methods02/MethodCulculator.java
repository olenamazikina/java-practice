package day33_methods02;

public class MethodCulculator {
	//public static void main(String[] args){
	
	
	 public static void addVoid (int num1, int num2) {
	        int sum=num1+num2;
	        System.out.println("Sum " +sum);
	    }
	    public static int add (int num1,int num2) {
	        int sum=num1+num2;
	        return sum;
	    }	
		public static double multiply(double num1,double num2){//return double  multiply
			double result=num1*num2;
			  return result;
			  //return num*num2
	}
public static double minus(double num1,double num2) {
	double result=num1-num2;
	  return result;
	//return num-num2
}
public static double divide(double num1,double num2) {
	
if(num2==0) {
	System.out.println("Error: Cannot/by 0");
	return 0;
	//System.exit(0);//stop the whole code
}else {
	double result=num1/num2;
	  return result;
	//return num/num2
}
}
}


