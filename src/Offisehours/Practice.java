package Offisehours;
/*

Inheritance: builds relationship between classes ( super and sub) 
					
				0.  	class  A      extends     class   B
						      sub                    	super			
						      		
							
				1. sub class inherits all the inheritable features from the super class 
				
					 features(blocks, or methods, or fields) that are not inheritable in super class: 
								1. features with private access modifier
								2. features with default access modifier(if sub class and super class are not in the same package)
						
								3. abstract methods ( if the sub class is not abstract class)
								
								
				2. super class cannot inherit any features from the sub class
				
				3. A class can only extend one class . A class can be extended by multiple classes
				
				4. super class cannot be final.			
					
				
*/


class A1{
	private int num1= 10;
	
	public void method1() {
		
	}

public class Practice extends Practice2 {
public void test() {
	System.out.println(name);
	//method5();
}
}

public void method2() {
	method1();//inhered
	System.out.println(num1);
	
}
}