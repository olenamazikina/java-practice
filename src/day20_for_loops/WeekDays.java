package day20_for_loops;

public class WeekDays {
	public static void main(String[] args) {
		//for loop:1-7
	int day=0;
		for( day=1;day<=7;day++) {
			switch(day) {
			case 1:
				System.out.println(day+" - Monday");
				break;
			case 2:
				System.out.println(day+" - Tuesday");
				break;
			case 3:
				System.out.println(day+"- Wensday");
			case 4:
				System.out.println(day+" - Thursday");
			case 5:
				System.out.println(day+" - Friday");
			case 6:
				System.out.println(day+" - Saturday");
			case 7:
				System.out.println(day+" - Sanday");
			break;
			default:
			}
		}
		
		
	}

}
