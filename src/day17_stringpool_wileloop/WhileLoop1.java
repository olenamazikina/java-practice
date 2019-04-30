package day17_stringpool_wileloop;

public class WhileLoop1 {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 200;
		while(n2>n1) {
			System.out.println("N2 is greater");
			n1=n1+10;
		}
		System.out.println("End");
	}

}
//The about lop is infinite loop.
//The condition n2>n1 will always be true, and never become false
//While loop keeps execution as long 