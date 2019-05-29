package day39_ArrayList;
import java.util.*;
public class UnikValues {
	public static void main(String[] args) {
		List<Integer> nums= new ArrayList<>();
		nums.add(10);nums.add(7);nums.add(3);nums.add(10);
		nums.add(15);nums.add(3);nums.add(9);nums.add(19);
		System.out.println(nums);
		
		// find non dublicate- unique values.if there 2AA-->A
		//[10,10,7,8,8,3,4,8]
		//10,7,8,3,4
		List<Integer> unique1= new ArrayList<>();//now is empty
		for(Integer num: nums) {
			//assign num to unique1 if nums is not already there
			if(!unique1.contains(num)) {//this condition is true ,now unick does not contain 10
				unique1.add(num);
				//we will find and print all unique
			}
		}
		System.out.println(unique1.toString());
				
				List<Integer> unique2= new ArrayList<>();//now is empty	
				for(int i=0; i<nums.size();i++) {
					int count=0;
					Integer value= nums.get(i);
					for(int k=0;k<nums.size();k++) {
						if(nums.get(k)==value&& i!=k) {
							count++;
							break;
						}
					}
				if(count==0) {
					unique2.add(value);
				}
				}
				System.out.println(unique2.toString( ));
			}
		
	}

