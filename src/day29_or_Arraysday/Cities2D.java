package day29_or_Arraysday;
import java.util.Arrays;
public class Cities2D {
	public static void main(String[] args) {
		
		String[][] countriesArray= {{"USA","Washington DC"},//0
				{"Canada", 	"Ottawa"},//1
				{"Mexico","Mexico city"},//2
				{"Brasil","Brasilia"},//3
				{"Peru", "Lima"},//4
				{"Argentina", "Boanes Aeros"},//5
				{"Bolivia","La Pazz  "},//6
				{"Macedonia","Scopia"},//7
				{"Kazakhstann","Nursultan"}};//8
		//String[][] c=new String [9][2];
		//c[0][0]= "USA";c[0][1]= "Washington DC";
		//print USA with capital city
		System.out.println(countriesArray[0][0]+"|"+countriesArray[0][1]);
		System.out.println(countriesArray[8][0]+"|"+countriesArray[8][1]);
	
			System.out.println(Arrays.deepToString(countriesArray));
			//print all the countries in same line to separate by |
			for(int i=0; i<countriesArray.length;i++) {
				System.out.print(countriesArray[i][0]+"|");//
			}
			for(String[] country:countriesArray) {
				System.out.print (country[0]+"|");
			}
			System.out.println();
			//get all the Cities and add cities[] array
			//declare cities array and size needs to match countries Arrays size 
			String[]cities=new String[countriesArray.length];
			//null ""means no object
				System.out.println(Arrays.toString(cities)); //nulll
				for(int i=0; i<countriesArray.length; i++) {
					cities[i]=countriesArray[i][1]; 
			}
				System.out.println(Arrays.deepToString(cities));//all cities
				//look for Bolivia in the countriesArr and test
				//if capital city is La pazz
				for(int y=0;y<countriesArray.length; y++){
					if(countriesArray[y][0].contentEquals("Bolivia")) {//if will not Bolivia it will false
					//	System.out.println(countriesArray[y][1]);
						if(countriesArray[y][1].equals("La  Paz")) {
							System.out.println("Bolivia test passed");
						}else {
							System.out.println("Bolivia test failed");
						}
						break;//exit the loop
					}
					
					
				}
		}
	
	}

	

