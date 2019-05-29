package day49_Inheritance2;

public class BarnesAndNobles {
	public static void main(String[] args) {
		
		
		EBook ebook=new EBook();
		ebook.setTitle("Introduction");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		 ebook.readEBook(10);
		 ebook.readEBook(621); 
		 
		 AudioBook aBook= new AudioBook();
		 aBook.setTitle("OCA");
		 aBook.setAuthor("Jeanne");
	      aBook.setTitle("Maruf");
	      
	      PaperBack pd = new PaperBack();
	      pd.setAuthor("Malcom Gram");
	      pd.setTitle("Outles");
	      pd.setType("Biografy");
	      pd.setPrice(20);
	      pd.setPages(300);
	      
	      System.out.println(pd.toString());
}
	}


