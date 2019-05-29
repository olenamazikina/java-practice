package day37_ArrayList;
import java.util.*;
public class RemoveInt {
public static void main(String[] args) {
	ArrayList<Integer>nums= new ArrayList<>();
	System.out.println(nums.size());
	System.out.println(nums.isEmpty());
	System.out.println(nums.size()==0);
	nums.add(5);
	nums.add(234);
	nums.add(56);
	nums.add(32);
	nums.add(67);
	nums.add(6);
	System.out.println(nums.toString());
	nums.remove(5);
	System.out.println(nums.toString());
	Integer n1 = new Integer(5);
	Integer n2 = Integer.valueOf(5);
	
	nums.remove( n1 );
	nums.remove(new Integer(4));
	System.out.println(nums.toString());
	
	
	
}
}
