package day34_methodsReturn;
import java.util.*;
public class CountArray {
public static void main(String[] args) {
	System.out.println(Arrays.toString(MainArray.getRandomArray(34)));//we can ask the method from anoter class
	int[] nums={1,2,3,4,55,6,6,7,7,8,8,};
	//1. way with Sout return rigth away
	System.out.println(findOccurences(nums,5));
	System.out.println(findOccurences(nums,6));
	//2.assign return value into a varible
	int five = findOccurences(nums, 5);
	System.out.println("5 values: " + five);
	if(five>0) {
		System.out.println("We have 5");
	}else {
		System.out.println("No 5 s");
	}
	if (findOccurences(nums,2)>0) {
		System.out.println("We have 2s");
	}else {
		System.out.println("No 2s ");//create array and pass to method
		int twenty=findOccurences(new  int [] {10,20,30,40,50},20);
		System.out.println("twenty:"+twenty);
}
}
		
		public static int findOccurences(int[]array,int value) {//after parantesiis give some value,return int
			 int counter=0;//incrrise counter
			 for(int num:array) {//our array int
				 if(num==value) {
					 counter++;//no break; because return only 1 and stop
				 }
			 }
			 return counter;
		}
	

public static int[] getArray() {
int [] retArray = {45,67,78,34,23};
      return retArray;
}
}
	//1 task class countArray
		//method findOccurences
		//return type int
		//Params.int array[],int value
		//and return the count of occurences


//2 


