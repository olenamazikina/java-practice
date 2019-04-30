package day24_For_Array;

import java.util.Arrays;

public class SumOfTheNumbers {
	public static void main(String[] args) {
		//let's create an array of integers length 3
		int[] numbers = new int[3];
		//first value array
		numbers [0] = 25;
		//second value in array
		numbers [1] = 10;
		//thidr value in array
		numbers[2] = 20;
		//[I@59f95c5d this is a hash code
		System.out.println(numbers);
		//to String() from arrays class help as to print an arrays as string
		System.out.println(Arrays.toString(numbers));//this class
		int sum = 0;
		//please use for loop in order to loop through the array
		//and calculate sum of all elements
		//numbers.length -->returns number of elements n the array
		//numbers.length = 5;//error
		for (int i =0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
			System.out.println("Sum:"+sum);
			//find largest value in the array  
			int max = Integer.MIN_VALUE;
			for (int i = 0; i <numbers.length; i++) {
				if (numbers [i] > max) {
					max = numbers[i];
				}
			}
			System.out.println("Max value:"+ max);
			
			//Task 
			//Please find min value in the arrayint max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for (int k = 0; k < numbers.length; k++) {
				if (numbers [k] < min) {
					min = numbers[k];
				}
			}
			System.out.println("Min value:"+ min);
			
			
			
		}
	}
			


			
			
			
	