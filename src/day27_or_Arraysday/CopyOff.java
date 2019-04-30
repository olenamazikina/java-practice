package day27_or_Arraysday;
import java.util.*;
public class CopyOff {
	public static void main(String[] args) {
		double[]d1 = {1.2, 3.4, 5.4};
		double[]d2=d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		d1[0]= 100.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[1] =400.4;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		double [] d3= Arrays.copyOf(d2,d2.length);
           System.out.println("D3:" + Arrays.toString(d3));
		
		d2[0] = 1;
		System.out.println("D3:" + Arrays.toString(d3));
	}

}
