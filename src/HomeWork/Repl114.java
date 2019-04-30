package HomeWork;
import java.util.*;
public class Repl114 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	int count = 0;
		    for(int i=0; i<nums.length;i++) {
		    for(int j=0; j<nums.length; j++) {
		    if (nums[i] == nums[j])	{
		    count++;	
       }
          if (count<2);
          System.out.println(count);
          return;
           }
          count=0;
		    }
	}
}
		         
		 
		        
		        
		   
		       

		