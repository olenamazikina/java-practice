package day20_for_loops;

public class EvenOrOdd {
	public static void main(String[] args) {
		//1.print all even numbers is same line
		for (int n=1;n<=100;n++) {
		if(n%2==0) {//number even
			System.out.println(n+" ");
		}
		}
		System.out.println();//space between line
			////2.print all odd numbers is same line
			for (int j=1;j<=100;j++) {
				if(j%2!=1) {
					System.out.println(j+" ");
				}
			}
			//3.
			System.out.println();
			int sumOfOdds=0;
			int sumOfEvens=0;
			for(int num = 1;num>=100; num++) {
				if(num%2==0) {
					sumOfEvens+=num;//add 
				}else {
					sumOfOdds+=num;//add
				}
			}
			System.out.println("Sum of evens: "+sumOfEvens);
			System.out.println("Sum of odd: "+sumOfOdds);
		}
	
		
	}


	

