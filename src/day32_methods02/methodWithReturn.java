package day32_methods02;

public class methodWithReturn {
	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i= giveMe10$();
		System.out.println("i: "+i);
		System.out.println(giveMeYourName());
		String myName= giveMeYourName();
				System.out.println("My name is "+myName);
	}

	// this method return int value
	 public static int giveMe10$() {
	        System.out.println("Returning 10 from method");
	        return 10;
	    }
	    
	    public static String giveMeYourName() {
	    String name = "Murodil";
	        return name;
	   }

	}

