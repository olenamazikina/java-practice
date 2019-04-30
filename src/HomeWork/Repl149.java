package HomeWork;
import java.util.*;

public class Repl149 {
	 public static void add_to_r(int[] r,int n) {
		  int[]= new_r;
		  new_r= Arrays.copyOf(r,r.length+1);
		  //r={1,2,3,}go to my r and copy one place(+1)
		  //new_r=
	new_r[new_r.length-1]=n;	
	System.out.println(Arrays.toString(new_r));		
	  }
	  public static void main(String[] args) {
			
		   //create new array with one more position.
		   Scanner inp = new Scanner(System.in);
		    int size = inp.nextInt();
		    int n = inp.nextInt();
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++) {
			arr[i] =inp.nextInt();
			
			
		}
	  
	  add_to_r(arr,n);
	  	 
	  }    	
  arr[i]=inp.nextInt();
	    
}
}
	  
	    
	  
	

