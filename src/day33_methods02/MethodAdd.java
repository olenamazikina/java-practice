package day33_methods02;

public class MethodAdd {
	public static void main(String[] args) {
		
	
		addVoid(2,5);
	    System.out.println(add(4,8));
	    int result=add(4,8);
	    System.out.println("Result:"+result);
	    System.out.println(add(6,2));
	    } 
	    
	    public static void addVoid (int num1, int num2) {
	        int sum=num1+num2;
	        System.out.println("Sum " +sum);
	    }
	    public static int add (int num1,int num2) {
	        int sum=num1+num2;
	        return sum;
	    }
	}
	