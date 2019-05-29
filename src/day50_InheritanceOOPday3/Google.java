package day50_InheritanceOOPday3;

public class Google extends SearchEngine{

@Override
	public int search(String item) {
		System.out.println("Searching for :"+item);
		int resultsCount= item.length();
		return resultsCount;

}

public void search(String item, String item2) {
System.out.println("Seaching for 2 items :"+item+" ,");
int resultsCount = item.length()+item2.length();
System.out.println( "Total count :"+resultsCount);
}
}