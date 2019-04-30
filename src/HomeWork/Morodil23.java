package HomeWork;
import java.util.*;
public class Morodil23 {
	public static void main(String[] args) {
		int[]arr1= {5,7,1 };
		int[]arr2= {20,5,5,22,7};
		//check if all items inarr1 present in arr2

		boolean containsAll= true;
		for(int n1:arr1) {
			System.out.println("Outer:"+n1);//5,7
			int count =0;
			for(int n2:arr2) {
				System.out.println("Inner:"+n2);
				if(n2==n1) {
					System.out.println("Found!"+n1+" is in Arr2!");
					count++;
					break;//for this loop
				}
			}
			if (count==0) {
				System.out.println("Did not find!"+n1+" is in Arr2!");
			}
		}
	}

}
