package day08_casting_conditionals;

  public class CastingPrimitives { 
	  public static void main(String[] args) {
	//cast double value to int
	int i = (int)3.4;//will remove .4
	System.out.println("i : " + i);
	double price = 230.50;
	int dollars = (int)price;
	System.out.println("Price:" + price);
	System.out.println("Dollars: " + dollars);
	//Whole Numbers. byte, short, int
	int count = 34544;//234 put 2345
	byte byteCount = (byte)count;
	System.out.println("ByteCount: " + byteCount);
	long longValue = 2456666667L;
	int intValue = (int)longValue;
	System.out.println("Int value: " + intValue);
	
	int large = 1345;
	short small = (short) large;
	System.out.println("Small :" + small);
	     //250        //250   250.2
	int result =(int)(500.4/2.0);
	System.out.println("Result:"+result);
	
	
	
}


}
