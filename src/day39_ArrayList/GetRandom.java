package day39_ArrayList;
import java.util.*;
public class GetRandom {
	public static void main(String[] args) {
		System.out.println(getRandomList(20));
		List<String>strNums= new ArrayList<>();
		strNums.add("34");
		strNums.add("4");
		strNums.add("3");
		strNums.add("348");
		List<Integer>converted= convertToIntList(strNums);
		
		System.out.println(converted);
		
		
		
		//List<Integer>rList=getRandomList(20);
		//Colections.sort(rList);
		//System.out.println(rList);
	}
public static List<Integer> getRandomList(int size){
	Random r = new Random();//object of Random class
	List<Integer>randomNums=new ArrayList<>();
	for(int i=1;i<=size;i++) {
		randomNums.add(r.nextInt(101));
}
	return randomNums;
}
public static List<Integer> convertToIntList(List<String> strList) {
    List<Integer> newList = new ArrayList<>();
    for(String str : strList) {
        newList.add( Integer.parseInt(str) );
    }
    return newList;
}
}