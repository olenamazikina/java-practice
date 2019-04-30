 package day16_strings_manipulation;
import java.util.*;
public class Url {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url:");
		String url = scan.next();
		//check www.we will use startsWith
		
		if(url.startsWith("www.")) {
			System.out.println("www. is present");
			
		}else {
			System.out.println("Invalid url format");
			return;
	}
		//check .is there right before extension
		//find out the leght of the url
		//do -4 and using charAt get the character
		//compare if it is '.'
		//www.etsy.com =>12 minus 4=>com.
		
		int dotIndex = url.length()-4;
		//url.LastIndexOf(".")
	if(url.charAt(dotIndex)=='.') {
		System.out.println(". is there before extension");
	}else {
		System.out.println(".migth be misplaced");
	}
		//if(url.charAt(url.length() -4)=='.'){
	//get domain and extension
	//www.yahoo.com
	String domain = url.substring(4,dotIndex);
	System.out.println("Domain:"+domain);
	//String extension=url.subsring
	String extension = url.substring(dotIndex+1, url.length());
	System.out.println("Extension:"+extension);
	
		
	}


}