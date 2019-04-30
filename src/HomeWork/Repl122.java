package HomeWork;
import java.util.*;
public class Repl122 {
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
		 int[] inhabitants = {10, 5, 20, 4, 0, 1, 6, 4};
		 int max =Integer.MIN_VALUE;
		 int maxPosition= 0;
		 int dayCounter=0;
		 for(int i =0;i<inhabitants.length;i++) {
			 if(inhabitants[i]>max) {
				 max=inhabitants[i];
				 maxPosition= 1;
			 }
			 }
		 do {
			 System.out.println("Day "+dayCounter+" "+Arrays.toString(inhabitants));
			 dayCounter++;
	 for(int j = 0; j<inhabitants.length; j++) {
	 inhabitants[j]= inhabitants[j]/2;
		}
		 }while(inhabitants[maxPosition]>0);
		 
		System.out.println("Day "+dayCounter+" "+Arrays.toString(inhabitants));   
		System.out.println("------EXTINCT-------- ");
		 }    
	}



