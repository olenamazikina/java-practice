package ReviewVasil;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] nums = {123, 532, 34, 643};
		//get 2 element from Array
		System.out.println(nums[1]);
		nums[1]=5;
		System.out.println(Arrays.toString(nums));
		int min = nums[0];	
		int max = nums[0];//usually we give max for the first number in array
		int counter=0;
		for(int num:nums) {
			System.out.println("Is "+num+" grater tan current max "+max+" or not?");
			if (num>max) {
				max=num;
			}
			System.out.println("Does "+num+" is less than");
			if(num<min) {
				min=num;
			}
		}
		System.out.println("Maximum: "+max);
		
		
	}

}
