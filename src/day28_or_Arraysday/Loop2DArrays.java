package day28_or_Arraysday;

import java.util.Arrays;

public class Loop2DArrays {
	public static void main(String[] args) {
		String[] [] pizzas ={ 
			{"pineapple","paperoni"},//0
				{"anchovies","mashroom","olives"},//1
		{"4 cheese"},//2
		{"chicken","tomatoes","japalenios","onions"},//3
		{"green","brocoly","shrimp","spinach","succini"}//4
	};//inside
//System.out.println(Arrays.deepToString(pizzas[0]));
		for(String[]pizza:pizzas) {
			System.out.print(pizza.length+"- ");
			System.out.println(Arrays.deepToString(pizza));
}
System.out.println("###### For loop  ### ");
for(int i = 0; i<pizzas.length; i++) {
	System.out.print(pizzas[i].length+"-");
	System.out.println(Arrays.toString(pizzas[i]));
}
for(String topping:pizzas[2]) {
	System.out.println(topping);//4 cheese
	
}
int[][] students = {
		{4,5,6},//3 element
		{23,24,34},
		{21,43,10,2,4,}//3 arrays
};
//2 parts : outer   loop,inner loop
//outer loop will take each group
//inner loop will take each value/ student id
for(int[] group: students) {
	for(int studentID:group){
		System.out.print(studentID+", ");
		
	}
System.out.println();
	}
	int [][]nums = {
			{10,20},//0
			{27,30,49,23},//1
			{100,34,234},//2
			{123,124,125,134,34,56}//3
	};
	for(int i=0; i<nums.length; i++) {
		for( int j=0; j<nums[i].length;j++){
			System.out.print (nums[i][j]+" ");
		}
		System.out.println();
			
		}
	}
	}

