package day52_Inheritancday5;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
		final int [] TEAMS= new int[]{11,11};
		System.out.println("Team1:"+TEAMS[0]);
		System.out.println("Team2 :"+TEAMS[1]);
		TEAMS[0]= 10;
		TEAMS[1]= 9;
		System.out.println("Team1:"+TEAMS[0]);
		System.out.println("Team2 :"+TEAMS[1]);
		
		//TEAMS = new int[10,10,10];//new array with 3 values you can to reassign ne warray using new key word
		int []nums = new int [] {23,45,678};
		System.out.println(Arrays.toString(nums));
		nums = new int[] {23,456,76,43,2};
		System.out.println(Arrays.toString(nums));
		
		final int [] finalNums= {34,67,54,32,78};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0]= 3456;
		System.out.println(Arrays.toString(finalNums));
		//finalNums= new int[] {34,56,76,78};
		final double[] PRICES= new double[3];
		PRICES[0]= 85.5;
		PRICES[1]= 99.9;
		PRICES[2]= 98.67;
		System.out.println(Arrays.toString(PRICES));
		PRICES[0]=81.5;
		System.out.println(Arrays.toString(PRICES));
		//PRICES= new double[3]; will not work
}
}