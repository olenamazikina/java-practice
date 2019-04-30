package day25_or_Arraysday03;

public class Popuation {
	public static void main(String[] args) {
		int[ ]population= new int[5];
		population[0] = 5000;//*2 will be work
		population[1]= 10000;
		population[2]=7000;
		population[4] = 8907;
		population [3] =4455;
		//population [7344];wil not work
		//int[] population = {5000, 10000, 7000,8907,4455};
		System.out.println("City 0 population:"+population[0]);
		System.out.println("City 1 population:"+population[1]);
		System.out.println("City 2 population:"+population[2]);
		System.out.println("City 3 population:"+population[3]);
		System.out.println("City 4 population:"+population[4]);
		int idx = 0;
		System.out.println("City 0 population:"+population[idx]);
		idx++;
		System.out.println("City 1 population:"+population[idx]);
		String str = "abc";                                   //3 city
		System.out.println("City STR population:"+population[str.length()]);
		
		//String array cities
				String []cities = {"Miami", "London", "Tokyo", "Rome","New York"};
				//population "Miami"
				// population "London"
				//population  "Tokyo"
				//population"Rome"
				//population"New York
				System.out.println("population of " +cities[0]+" is "+population[0]);
				System.out.println("population of " +cities[1]+" is "+population[1]);
				System.out.println("population of " +cities[2]+" is "+population[2]);
				System.out.println("population of " +cities[3]+" is "+population[3]);
				System.out.println("population of " +cities[4]+" is  "+population[4]);
				
				
			}
		}
	
		
	
