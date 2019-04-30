package HomeWork;
import java.util.*;
public class Repl129 {
public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++) {
	      for(int j=0 ;j<=cols-1;j++) {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	      //System.out.print ([i][j]+" ");
	   
	}
}
}