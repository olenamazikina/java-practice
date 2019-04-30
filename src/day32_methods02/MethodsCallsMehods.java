package day32_methods02;

public class MethodsCallsMehods {
	public static void main(String[] args) {
		makePancakes();
		makePasta();
		cook("Omelette","Eggs,Salt,Tomatos,Onions,Peppers");
	}
	public static void cook(String dish, String ingrid) {
		System.out.println("----"+dish.toUpperCase()+" Recipe-----");
		add(ingrid);
		System.out.println("Cook it");
		System.out.println("---"+dish.toUpperCase()+" Is Ready!----");
		
	}
	public static void makePasta() {
		System.out.println("----Italian pasta------Recipe");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmasan cheese,marinara");
		System.out.println("---PASTA is ready-----");
	}
	
		public static void add(String ingrid) {
		
			
			System.out.println("Add"+ ingrid);
			
		}
	
		public static void mix(int seconds) {
		System.out.println( "Mix for "+seconds+" seconrds");
		
			
		}
	
	public static void fry(int minutes){
		System.out.println( "Fry for "+minutes+" minutes");	
	
		
	}
	public static void boil(int minutes){
		System.out.println("Boil for "+minutes+" minutes");
		
		
	}
	public static void makePancakes() {
		System.out.println("----Pancakes Recipe--------");
		add("Milk,Eggs,Flour, Salt, Sugar" );
		mix(120);
		fry(3);
		System.out.println("-----Enjoy your delicious pancekes-------");
	}
}

