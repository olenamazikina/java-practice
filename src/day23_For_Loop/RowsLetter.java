package day23_For_Loop;

public class RowsLetter {
	public static void main(String[] args) {
/*		//outer loop will repeat printing of letters as many times as want
		//in this case we are gonna print3 times
		//so we are running inner loop 3 times
		for(int i = 0; i<=3; i++) {
		//write a for loop that will print letter from a to z
			for(char letter = 'a'; letter<='z'; letter++) {
			System.out.print(letter);
		}
		System.out.println();
	System.out.println("**************************************");
		}
		

}
}
*/	

for(int i = 0; i<=3; i++) {
	//if index is even print letter from a to z
	if (i%2==0){
		for(char letter = 'a'; letter<='z'; letter++) {
		System.out.print(letter);
		}
	}else {
		for(char letter = 'z'; letter>='a'; letter--) {
	System.out.print(letter);
		//if index is odd (it means 1,3,5 print from z till a 
		}
	}
	System.out.println();
System.out.println("**************************************");
	}
	}
}	