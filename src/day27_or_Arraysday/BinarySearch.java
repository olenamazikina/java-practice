package day27_or_Arraysday;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(nums,55));//4
		System.out.println(Arrays.binarySearch(nums,7));//2
		
		int i = Arrays.binarySearch(nums,10);
		System.out.println(i);
		int[] nums2 = {40,6,78,45,34,3};//3 6 34 40 45 78
		//Arrays.sort(nums2);this line convert to sort
		System.out.println(Arrays.binarySearch(nums2,40));
		//Arrays.binarySearch(a,fromIndex, toIndex,key)
	}
	

}
