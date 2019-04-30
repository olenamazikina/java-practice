package day30_methods02;
import java.util.*;
public class MyNambers {
	public static void main(String[] args) {
		showMe5Numbers();
		doPush10Ups(); doPush10Ups();
		rangePrint();
	}
public static void showMe5Numbers() {
	Random ram = new Random();
	for (int i=0; i<5;i++) {
		System.out.println(ram.nextInt(1001)+"");//print random num 0-100
	}
	System.out.println();//take 
		}


public static void doPush10Ups(){
	for(int j=0;j<=10;j++) {
		System.out.println("Push - "+j);
}
		System.out.println("Time to rest");

}
public static void rangePrint() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Print two numbers:");
	int nums1= scan.nextInt();//2
	int nums2 = scan.nextInt();//5
	
	//        5     7   is it true?
		if (nums1 <nums2 ) {
	for (int i =nums1; i<=nums2; i++) {//do this
		System.out.print(i+" ");
	}
	}else if (nums1>nums2) {//if fals do this
		for (int k = nums1; k>=nums2;k--) {
			System.out.print(k+" ");
		}
	}else {
		System.out.println(nums1);
	}
		
}
}
	
		
	

