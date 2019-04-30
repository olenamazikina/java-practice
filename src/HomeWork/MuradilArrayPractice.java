package HomeWork;
import java.util.Arrays;
public class MuradilArrayPractice {
	public static void main(String[] args) {
		int[] nums = {10,15,20,25,30};
		System.out.println(Arrays.toString(nums));
		//print everything using for each loop
		for(int n: nums) {
			if(n>17) {
				System.out.println(n);
			}
		}
		//calculate sum using for loop
		int sum= 0;
		for (int i=0; i<nums.length; i++) {
			sum+=nums[i];
			
		}
		System.out.println("Sum: "+sum);
		//print middle number
		int m = nums[ nums.length/2];//[2]
		int l = nums[nums.length-1];//[4]
		System.out.println("m:"+m+"| l:"+l);
		
		
		//find the lowest
		//assignt first number then compare in the loop
		int lowest= nums[0];//30
		for(int i =0; i<nums.length; i++) {
			if(nums[i] <lowest) {///max we can use too
				lowest = nums[i];
				
				
			}
		}
		System.out.println("Lowest num: "+lowest);
	}
}	

		/*	
int max= nums[0];//30
for(int i =0; i<nums.length; i++) {
	if(nums[i] >max) {///max we can use too
		max = nums[i];
		
		
	}
}
System.out.println("Max num: "+max);
}*/
