package day31_methods02;

public class Google {
	public static void main(String[] args) {
		
	//method googleSearchResalt
	//return void
	//params 1 String
	// googleSearchResalt("About 121,000,000 result (0.75 secnd)
	//Result count : 121000000
	//Time in second
googleSearchResults("About 121,000,000 results (0.75 seconds)");
		
		String resultsStr = "About 16,600,000 results (0.73 seconds)";
		googleSearchResults(resultsStr);
}
	
	
	//   googleSearchResults("About 121,000,000 results (0.75 seconds)");
	public static void googleSearchResults(String result) {
		//split by space into array
		String[] words = result.split(" ");
		String count   = words[1].replace("," , "");
		String seconds = words[3].replace("(" ,  "");
		
		System.out.println("Results count: " + count);
		System.out.println("Time in seconds: " + seconds);	
	}
	
}








