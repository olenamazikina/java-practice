package HomeWork;
import java.util.*;
public class Repl125 {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
			for(int i =0; i < size; i++) {
				nums[i] = scan.nextInt();
			  int[] copy = new int[nums.length*2];

			       copy[copy.length-1]=nums[nums.length-1];

			         System.out.println(Arrays.toString(copy));
			}
			  }
	}

