package day36_methodsPractice;
import java.util.*;
public class ArrayListIntrodaction {
	public static void main(String[] args) {
		//Create an array list
		String[] str = new String [5];
		ArrayList<String>names=new ArrayList<>();
		
		int[]numsArray=new int[5];
		ArrayList<Integer>nums=new ArrayList<>();
		
		//assing values into arrays list
		
		names.add("Roman");
		names.add("Olan");
		names.add("Vlad");
		
		nums.add(1000);
		nums.add(34);
		nums.add(45);
		
		//nums .add(e)
		//read from arraylist
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		System.out.println("Names count:"+names.size());
		System.out.println("Nums count:"+nums.size());
		
	}

}
