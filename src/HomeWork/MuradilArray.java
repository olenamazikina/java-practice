package HomeWork;
import java.util.*;
public class MuradilArray {
	public static void main(String[] args) {
				        int[] nums = new int[] { 1, 4, 6, 7, 12 };//we sorted to  array 
				        int[] nums2 = new int[] { 1, 4, 6, 3, 7, 12 };
				        int[] num3= new int[] {2,4,5,6,7};
				        
				        isArraySorted(nums);
	                   isArraySorted(nums2);
	                   isArraySorted(nums3);
	}
				        boolean sorted = true;
				        for (int i = 0; i < nums.length - 1; i++) {
				            System.out.println(nums[i] + " " + nums[i + 1]);
				            if (nums[i] > nums[i + 1]) {
				                sorted = false;
				                break;//exit the loop
				            }
				        }
				      System.out.println("Array is sorted? - "+sorted);
				      sorted = true;
				        for (int i = 0; i < nums2.length - 1; i++) {
				            System.out.println(nums2[i] + " " + nums2[i + 1]);
				            if (nums2[i] > nums2[i + 1]) {
				                sorted = false;
				                break;//exit the loop
				        }
				   
	}
				        System.out.println("Array is sorted? - "+sorted);
}

         public static void isArraySorted(int n) { //method accepts array of ints
        	boolean  sorted = true;///local variable
		        for (int i = 0; i < nums3.length - 1; i++) {
		            System.out.println(nums3[i] + " " + nums3[i + 1]);
		            if (nums3[i] > nums3[i + 1]) {
		                sorted = false;
		                break;//exit the loop
        	 
         }
         }
		        System.out.println("Array is sorted? - "+sorted);
         }
}
}