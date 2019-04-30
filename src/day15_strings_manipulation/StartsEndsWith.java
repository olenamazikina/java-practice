package day15_strings_manipulation;

public class StartsEndsWith {
	public static void main(String[] args) {
		String word1 = "eclipse";
		//stertsWith ==>tests if string starts with another
		System.out.println(word1.startsWith("e"));//true
		System.out.println(word1.startsWith("ec"));//true
		System.out.println(word1.startsWith("ecli"));//true;
		
		System.out.println(word1.startsWith("Ec"));//false
		
		System.out.println(word1.startsWith("e"));//true
		System.out.println(word1.startsWith("ipse"));//false
		System.out.println(word1.startsWith("java"));//false
		
		//"PSE"
		System.out.println(word1.toUpperCase().endsWith("PSE"));
		System.out.println(word1.endsWith("eclipse"));
		
		//Mr.==>man
		//Mrs.==>married woman
		//Ms.==>some woman
		//Dr.==>Doctor man or woman
		//==>UnKnown status
		String name = "Dr.Jackson";
		
		if (name.startsWith("Mr.")) {
			System.out.println("man");
		}else if(name.startsWith("Mrs.")) {
		System.out.println("married woman");
	   }else if(name.startsWith("Ms.")) {
		System.out.println("Some woman");
	   }else if(name.startsWith("Dr.")) {
		   System.out.println("Doctor man or woman ");
	   }else {
		   System.out.println("Unknown status");
		}
		
		
	}

}



