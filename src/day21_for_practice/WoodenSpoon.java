package day21_for_practice;
import java.util.*;
public class WoodenSpoon {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		       //     01234
		String word = "javva";
		String unique = "";
		
		char ch = word.charAt(0);
		System.out.println(unique.contains(""+ch));
		if(!unique.contains(""+ch)) {
			unique += ch; //unique = unique+ch;
		}
		
		System.out.println("Unique:" + unique);
		
		

	}
}


/*
String word2 = "bananas";
string unique2="";
int i = 0;
char ch2 = word2.charAt(i);//b
System.out.println("Ch2:"+ch2);
i= 1;
ch2 = word2.charAt(i);//a
System.out.println("Ch2:"+ch2);
//bananas
i++;//2
ch2 = word2.charAt(i);//n

//check if ch2

System.out.println("Ch2:"+ch2);

*/