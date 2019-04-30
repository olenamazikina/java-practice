package day04_primitives_operators;

public class StringConcat {
     public static void main(String[] args) {
    	 String firstName = "Olena";
    	 System.out.println("My name is " + firstName);
    	 String city = "Kurilovka";
    	 System.out.println("I was born in " + city);
    	 String job = "SDET";
    	 String company = "Amazon";
    	 System.out.println("I work as " + job + " in " + company);
    	 int zipcode = 22153;
    	 System.out.println("I live in " + zipcode + " zipcode");
    	 int num1= 10;
    	 int num2 = 20;
    	 System.out.println(num1 + " " +num2);
    	 String city1 = "Tashkent";
    	 String city2 = "Kyiv";
    	 String city3 = "Moscov";
    	 System.out.println("From "+ city1+"to"+ city2+"is $500");
    	 System.out.println("From "+city3+"to"+city1+"is $500");
    	 System.out.println("I have been to "+city1+", " +city3+", " +city2 + ".");
    	 
    	 String app = "Slack";
    	 System.out.println("We use " +app+" for messeging with Classmates");
    	 
    	 
    	  app ="Skype" + " and Slack";
    	 System.out.println("We use " +app+" for messeging with Classmates");
    	 
    	 
     }
}
