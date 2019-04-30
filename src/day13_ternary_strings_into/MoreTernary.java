package day13_ternary_strings_into;

public class MoreTernary {
	public static void main(String[] args) {
		String quality = "good";//bad
		int rating = (quality.equals("good"))? 100 :0;
		System.out.println("Rating: " +rating);
		
		
		
		
		int  PMHour = 6;
		 //Rush hour during evening: 4-7
		boolean rushHour = ( PMHour >= 4 && PMHour<= 7)? true:false;
		//System.out.println(PMHour +"is rush hour?" + rushHour);
		//rushHour ==>true - yes
		//ryshHour ==>false - no
		
		
		System.out.println(PMHour+" is rush hour?" + rushHour);
		
		
		
		int AMHour = 8;//6-9
		//6-9 amRushHour - yes,no
		String amRushHour = AMHour >= 6 && AMHour >= 9?"Yes" :"No";
				System.out.println(AMHour +" is rush hour? -" + amRushHour);
		
	}


}