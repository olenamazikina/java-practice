package day18_while_dowhile_loops;

public class StairCase {
	public static void main(String[] args) {
		/*String stairs = "*";
		System.out.println(stairs);
		stairs = stairs+"*";
		System.out.println(stairs);
		stairs += "*";
		System.out.println(stairs);*/
		String stairs = "*";
	//1)with a counter
		int num =1;
		while(num<=10) {
			System.out.println(stairs);
			stairs+="*";//**********
			num++;
		}
	

		//2) checking length
		stairs = "*";
		while(stairs.length()>=10) {
			System.out.println(stairs);
			stairs +="*";//***4less than 10 keep looping until 10
		}
		
	}
}
		


