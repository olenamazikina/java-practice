package day36_methodsPractice;

public class Autoboxing {
	public static void main(String[] args) {
		//autoboxing-->
		Integer num1=1234;
		int n= 5;
		Integer num2 = n;
		// unboxing ->object ->primitive
		Double d1= new Double(34.2);
		double d2 =d1;
		System.out.println("d1:"+d1);
		System.out.println("d2"+d2);
		long l1= new Long(600000);//unboxing 
		Long l2= new Long (2345432L);
		long l3 = l2;//auto un boxing
		Long l4= l3;//auto boxing
		
		Integer num3= Integer.valueOf(345);
		//Double d3 = num3 ;casting not posible wrapple classes
		
		
		
		
	}

}
