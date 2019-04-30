package day28_or_Arraysday;

import java.util.Arrays;

public class FootballTeams {
	public static void main(String[] args) {
		String[] [] teams= new String [2][6];
		//declera multid array with 2 rows and 6 
		teams[0][0]= "Irina";
		teams[0][1]= "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams [1][0] = "Olimjion";
		teams [1][1] = "Mirshod";
		teams[1][2]= "Uslan";
		teams[1][3] =" Nursultan";
		teams[1][4] ="Roman";
		teams[1][5] = "Dmitry";
		System.out.println("First player of first team:");
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]);//Habib
		System.out.println(teams[1][5]);//Dmitry
		//print how many rows/ teams/arrays
		System.out.println("Number of rows: "+teams.length);
		System.out.println("People in fist team: "+teams[0].length);
		System.out.println("People of in second team: "+teams[1].length);
		System.out.println(Arrays.deepToString(teams));//two groups
		
	int [][]  nums= new int[3][4];
	nums[0][0]=100;
	nums[0][1]=34534;
	nums[0][2]=343242;
	nums[0][3]= 3452;
	
	nums[1][0]=100;
	nums[1][1]=34534;
	nums[1][2]=343242;
	nums[1][3]= 3456;
	
	nums[2][0]=100;
	nums[2][1]=34534;
	nums[2][2]=343242;
	nums[2][3]=3456;
	System.out.println(Arrays.deepToString(nums));
	
	System.out.println(Arrays.toString(nums[0]));//if you want only one you need use toString
	
	int [][] scores = {{3,4,5}, {2,5,7,23}};
	System.out.println("Days played /Number of arrays: "+scores.length);
	System.out.println("Number of values in 1: "+scores[0].length);
	System.out.println("Number of values in 2: "+scores[1].length);
	
	int [][] values = new int[4][];
	values [0] = new int[] {23,43,45};
	values [1]= new int [] {23,43,45,56,43,56,23,234,5};
	values[2] = new int [2];//0,0
	values[2][0]= 55;
	values [2][1]= 88;
	
	values [3] = new int[] {3,21,34,54,34};
	
	System.out.println(Arrays.deepToString(values));
	
	
	
	
	
	
	
	
	
	
	}

}
