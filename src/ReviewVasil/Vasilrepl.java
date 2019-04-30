package ReviewVasil;
import java.util.*;
public class Vasilrepl {
	Scanner scan = new Scanner(System.in);
	String json = scan.nextLine();
	
	//input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
	//String firstName= json.substring(json.indexOf("firstName")+13,json.indexOf("\",\"lastName\""));
    String firsttName= json.substring(json.indexOf("firstName")+13,json.indexOf("\"",json.indexOf("firstName")));
    String lasttName= json.substring(json.indexOf("lastName")+12,json.indexOf("\",\"role\"")));
    Sout ("Firs name: "+firstName);
    System.out.println("Last name: "+lasttName);

			
   // json.substring(json.indexOf("firstName")+13 it means find first name
    		
}
}