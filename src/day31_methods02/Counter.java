package day31_methods02;
import java.util.*;
public class Counter {
	public static void main(String[] args) {
		//name: counUp
		  // return type: void
		 //  param/Input: int
		 //  it prints from 1 to the value of the param
		  // countUp(5);
		 //  1 2 3 4 5
	
        countUp(5);//num =5;
	    countUp(10);//or /num=10;
        //countUp(Hi!)//will not work only int
	    countUp(10);
	    countUp(0);
	    countUp(-5);
        countDown(3);
       int n =5;
        countDown(n);//num=n
        countDown(0);
        countDown(-3);
        countDown(5);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num to countUp");
        //get number from keyboard
        int inputNum = scan.nextInt();
        //call counUp method and set it as input
        countDown(inputNum);
	} 
public static void countUp(int num) {//if num 0 it will be falls 
    if(num<1) {//if it true do every thing down
    	System.out.println("Invalid input- "+num);// param value less than 1 then
    }else {
	for(int i=1; i <=num; i++ ) {
    		System.out.print(i+" ");
    	}
   System.out.println();
    }
}
//return type: void
		   //param: int
		   //it prints from param value till 1
		  // countDown(5);
		  // 5 4 3 2 1
 public static void countDown(int num) {
	 if(num<1) {
	    	System.out.println("Invalid input");
	 }else{// param value less than 1 then
	
		 for(int n=num; n>0; n--) {//because we will start from large number
		 System.out.print(n+" ");
	 }
	System.out.println(); 
}
}
}
	
	

	 

	

       