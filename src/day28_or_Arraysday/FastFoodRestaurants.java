package day28_or_Arraysday;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		//read all data and assign to array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		System.out.println("Data size:"+data.length);
		//information in separate line 
		//print first row (line)
		System.out.println(data[0]);
		System.out.println(data[1]);
		//print last restaurant
		System.out.println(data[data.length-1]);
		
		//System.out.println(Arrays.toString(data)); 
		int counter=0;
		for(String restaurant:data) {
			System.out.println("#"+counter+"=>"+restaurant);//it is showed number
			counter++;
		}
		
	
	
	//Print all restaurant information in state of VA
			//also counted and print
			int countVA = 0;
			for (String row:data){
				if (row.contains(",VA,")) {
				System.out.println(row);
				countVA++;
				}
			}
			System.out.println("######Total restaurants in VA:"+countVA);
				//Find all restaurant information in state of VA
			//print the restaurant names along with cityname
			//Subway- Herdon
			
			for(String res:data) {
				if(res.contains(",VA,")) {
				String[] resArr= res.split(",");
				
			System.out.println(resArr[2]+"-"+resArr[1]);
				}
			
		}
	}

}