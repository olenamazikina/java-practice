package HomeWork;
import java.util.*;
public class Repl123 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int decimal= input.nextInt();
	int [] binary= new int[8];
int a= 128;
for(int i=0;i< binary.length;i++) {
	binary[i]= decimal/a;
	decimal= decimal%a;
	a=a/2;
	System.out.println(decimal);
}
System.out.println(Arrays.toString(binary));	
	
}
} 
