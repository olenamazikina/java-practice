package day27_or_Arraysday;

public class CanvasCourses {
	public static void main(String[] args) {
		String url= "https:/learn.cybertekschool.com/courses/149";
		//split by /and store into array
		//get last number and convert to int data type
		//use switch  statement to find course name
		String [] urlArr= url.split("/");
		System.out.println(urlArr);
				System.out.println("Length :"+urlArr.length);
				System.out.println(urlArr[urlArr.length-1]);
				int courseID= Integer.parseInt(urlArr[3]);
		
				switch(courseID) {
				case 147:
					System.out.println("the course is Java Programming");
					break;
				case 204:
					System.out.println("Mentoring Session");
					break;
				case 149:
					System.out.println("SDLC");
					break;
				case 152:
					System.out.println("Qa Testing");
					break;
				case 144:
					System.out.println("Team activity");
					break;
				case 143:
					System.out.println("Welcome Kit");
					break;
					default:
						System.out.println("Invalid number for the course");
						break;
			
				

//--> split by "/" and get the last value from array
//--> convert it to integer. Integer.parseInt(...) -> int value
//--> switch statement and find the matching



	
	}

}
}