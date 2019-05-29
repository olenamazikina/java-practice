package day32_methods02;
import java.util.*;
public class ArrayParametrs {
	public static void main(String[] args) {
		

		    int[] myArray = {44,22,66,11};
		    
		        printArray(myArray);
		        printArray(new int[] {33,45,45,67});
		        int[] myNums =new int[] {3,4,5,6,7,3,42,45,2,5,46,6};
		        printArray(myNums);
		        int[]one = {10,2,3,9};
		        int[]two =  {3,1,35,6};
		        print2Arrays(one,two);
		        print2Arrays2(one,two);
		        
		}

		public static void printArray(int[]nums) {
		    for(int n: nums) {
		        System.out.print(n+" ");
		    }
		    System.out.println();
		}
		
		
		
		 public static void print2Arrays(int[]arrNums1,int[]arrNums2) {
		      if (arrNums1.length>arrNums2.length) {
		          System.out.println(Arrays.toString(arrNums1));
		          System.out.println(Arrays.toString(arrNums2));
		      } else {
		          System.out.println(Arrays.toString(arrNums2));
		          System.out.println(Arrays.toString(arrNums1));
		      }
		 }
		     
		 //we will call printArray method
		
		      public static void print2Arrays2(int[]arrNums1,int[]arrNums2) {
			      if (arrNums1.length>arrNums2.length) {
			    	  printArray(arrNums1);
			    	  printArray(arrNums2);
			          
			      } else {
			    	  printArray(arrNums2);
			    	  printArray(arrNums1);

		}
		 }
}	