package HomeWork;
import java.util.*;
public class Repl126 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			int sizeInner = scan.nextInt();
			int sizeOuter = scan.nextInt();
			int[] inner = new int[sizeInner];
			int[] outer = new int[sizeOuter];
			for(int i =0; i < sizeInner; i++) {
				inner[i] = scan.nextInt();
			}
			for(int j =0; j < sizeOuter; j++) {
				outer[j] = scan.nextInt();
			}
			Arrays.sort(inner);
			Arrays.sort(outer);
			//WRITE YOUR CODE HERE
			System.out.println(Arrays.toString(inner));
			System.out.println(Arrays.toString (outer));
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
}
//write a program that will print true
// if first and last value in the array of ints
// are same - print true
// final int length = 6;
int[] numbers = { 2, 41, 213, 21, 42, 2 };
// .length <- it's not a method, it's a instance variable (property)
boolean equals = numbers[0] == numbers[numbers.length - 1];
System.out.println(equals);
System.out.println(numbers[0] == numbers[numbers.length - 1]);
if (numbers[0] == numbers[numbers.length - 1]) {
	System.out.println(true);
} else {
	System.out.println(false);
}
			
			
			
			
}
}