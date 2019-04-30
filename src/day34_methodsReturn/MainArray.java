package day34_methodsReturn;
import java.util.*;
public class MainArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(CountArray.getArray()));
		//store return value into array
		int[] nums = CountArray.getArray();
		System.out.println(Arrays.toString(nums));
		
		//for(;;) { //while(true) ==> both are infinite loop
		System.out.println(Arrays.toString(getRandomArray(34)));
		//}
		int[] randomNums = getRandomArray(45);
		System.out.println(Arrays.toString(randomNums));
		
	}

public static int[] getRandomArray(int size) {
	Random rand = new Random();
	int[] nums = new int[size];
	for(int i = 0; i < size; i++) {
		nums[i] = rand.nextInt(101);
	}
	return nums;
}

}





//method name getRandomArray
//return type : int[]
//params int size
//in the method create an array with value of size
//and assiign random values from 0 - 100 and return it