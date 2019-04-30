package day15_strings_manipulation;

public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";
			System.out.println(email.contains("@"));
			
			String list = "potatoes, apples, tomatoes, eggs, milk, bread, meat,cereal";
			//check if apples is in the shopping list
			//true==> Apples are ther!
			//false==>Lets add apples now!
			
			if (list.contains("apples")) {//used to check we don't care where
				System.out.println("Apples are there!");
			}else {
				System.out.println("Lets Add apples now!");
			}
			boolean hasEggs = list.contains("eggs");
			System.out.println("Contains eggs: "+hasEggs);
			
			boolean hasCucumbers = list.contains("cucumbers");
			System.out.println("Contains cucumbers: "+ hasCucumbers);
			
			 email = "name@yahoo.com";
			 if (email.contains("yahoo")) {
				 System.out.println("Yahoo account");
			 }else if(email.contains("gmail")) {
				 System.out.println("Gmail account");
			 }else if(email.contains("@fgdry")) {
				 System.out.println("Hot mail account");
	}
	
	String etsyTitle = "Wooden spoon | Etsy";
	if(etsyTitle.contains("|")) {
		System.out.println("Pipe is there as expected");
	}else {
		System.out.println("Pipe is not detected");
	}
	//Assign your name and check it contains "a" or "e" letters
	String str = "|";
	System.out.println(etsyTitle.contains(str));
	String name = "Alexander";
	if(name.contains("a") || name.toLowerCase().contains("e")) {

		System.out.println("'a' or 'e' is present");
	}else {
		System.out.println("'a' or 'e' is missing");
	}
 }
}

       
   



















