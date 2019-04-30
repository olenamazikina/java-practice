package day22_For_Practice;
import java.util.*;
public class Substring {
	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.substring(0,2));//ja
		//print each character in separate line using
		//substring,no loop needed
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));//4,5 it will be error
		System.out.println("#########");
		int i =0;                      // 0,  1
		System.out.println(word.substring(i ,i+1));
		i++;                       //    1    2
		System.out.println(word.substring(i ,i+1));
		i++;                       //    2   3
		System.out.println(word.substring(i ,i+1));
		i++;                       //    3   4
		System.out.println(word.substring(i ,i+1));
		
		System.out.println("####################");
//		java
//		0123
//using for loop and substring.print each char		
		for(int n= 0;n<= 3; n++) {         //0   1
			//System.out.println(word.substring(n,n+1));
			String letter= word.substring(n,n+1);
			System.out.println(letter);
			
		}
		System.out.println("######REVERS######");
		for(int n=3;n>=0;n--) {
			String letter= word.substring(n,n+1);
			System.out.println(letter);
		
	}
int start = 1 ;
int end = 10;
String word2="UnitedStates";
System.out.println(word2.substring(start,end));//2,3==i;  6,7==s
System.out.println(word2.substring(2,3));

//pass single input start only and will includeuntil 

//print last character
              //01234
String word3 = "apple";

System.out.println(word3.substring(word3.length()-1));

}
}


