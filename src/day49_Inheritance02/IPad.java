package day49_Inheritance02;
import day49_Inheritance2.Device;
//iPad is a Device. Ipad is a Subclass in a different package
public class IPad extends Device {
public void readBook(String title) {
	System.out.println("Reading a book "+title+" using "+brand+" ipad");
	System.out.println("Model:"+model);
	//System.out.println("Price: "+price);//not visible only same packege
}
}
