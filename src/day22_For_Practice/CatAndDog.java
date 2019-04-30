package day22_For_Practice;

public class CatAndDog {
	public static void main(String[] args) {
		String str= "macatyourcat";
		//count how many cat
		int cats = 0;
		for(int i=0;i<=str.length()-3;i++) {
			System.out.println(str.substring(i, i+3));
			if(str.substring(i, i+3).equals("cat")) {
				cats++;
			}
		}
		System.out.println("Cats: "+cats);
	}
	
	

}
