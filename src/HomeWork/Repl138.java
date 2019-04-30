package HomeWork;
import java.util.*;
public class Repl138 {
	 public static void main(String[] args) {
	   // Scanner input = new Scanner(System.in);
	   // int[] inhabitants = new int[8];
		 int[]inhabitants= {3,6,0,4,3,2,7,0};
         //  {f,f,t,f,t,f,t,t
	    int dayCount=0;
	    int sum =0;
	    boolean [] check = new boolean[inhabitants.length+2];
	    
	   // for(int i=0; i<inhabitants.length; i++) {
	    //  inhabitants[i] = input.nextInt();
	      //if there 's a zero in the element /city ,then the adjacent city will /2
	      //array and for loop
	      //1)as i find divide by two
	      //2)[3,6,0,4,3,2,7,0]
	      //   x x0xxxxxxxxx0
	      //[0,1,1,2]
	      //0
	      //[0,0,1,2]
	      //0
	      //[0,0,0,2]
	      //we will use arrays to save the information
	      //[f,f,f,t,f,f,t]
	      //[f,t,f,t,f,t]
	      //storing information about where to divide by two in a boolean array
	    System.out.println("Day "+(dayCount++)+" "+Arrays.toString(inhabitants));
	      do {
	    	  sum=0;
	      for (int i=0; i<inhabitants.length; i++) {
	    	if(inhabitants[i]==0) {
	    		check [i]=true;
	    		check[i+2]=true;
	    	}
	    	}
	    // System.out.println(Arrays.toString(inhabitants)+"before");
	      //accessing the boolean array to make the appropriate changes
	      for (int j=1; j<check.length-1; j++) {
	    	  if (check [j]) {
	    		inhabitants[j-1] /=2;
	    		//inhabitans[j-1]=inhabitans[j-1]/2;
	    	  }
	    	  sum+=inhabitants[j-1];
	      }
	      System.out.println("Day "+(dayCount++)+" "+Arrays.toString(inhabitants));
	      } while(sum!=0);
	     
	     System.out.println("---EXTINCT---");
	    }
	 }


	 

