package day19_while_loops;

public class DoWhile {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
//write a do while loop calculate sum of numbers
		//between 1 to 5
		//1+2+3+4+=15
		int sum = 0;
		int j = 1;//two variebs here
		do { 
		sum = sum+j;
		j++;//sum +=j
		}while(j<=5);//check the condition on the botton
	
		System.out.println("Sum from 1 to 5 is "+sum);


		}

	}


