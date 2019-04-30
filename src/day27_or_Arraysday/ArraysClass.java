package day27_or_Arraysday;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		int[]nums= {43, 2, 1, 3, 5};
		// to String method
		System.out.println(Arrays.toString(nums));
		
		String str= Arrays.toString(nums);
				System.out.println(str);
				
				//sort method.sort array in ascendng order
				Arrays.sort(nums);
				System.out.println(Arrays.toString( nums));
				String[]languages = {"Zulu", "Italian", "Arabik", "Rassian"};
				System.out.println(Arrays.toString(languages));
				Arrays.sort(languages);
				System.out.println(Arrays.toString(languages));
				
				int [] nums2= {345,665,333,11,3,66};
				//find lowest and largest values from nums2 array
				System.out.println(Arrays.toString(nums2));
				Arrays.sort(nums2);
				int lowest= nums2[0];
				int largest= nums2[nums2.length-1];//index
				System.out.println("Lowest num: "+lowest);
				System.out.println("Laregest num: "+largest);
				
				
				
				
				
	}

}
