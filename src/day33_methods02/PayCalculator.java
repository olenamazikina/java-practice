package day33_methods02;

public class PayCalculator {
	public static void main(String[] args) {
		int pay=getHourlyPay(40,50);
		System.out.println("Total pay for 40 hours:"+pay);
		System.out.println(getHourlyPay(23,10));
		int noPay=getHourlyPay(10,0);
		System.out.println("No pay:"+noPay);
	}
public static  int getHourlyPay(int hours, int rate) {///this method wich  to retorn int or double or String
	if (hours <=0){
	System.out.println("Inavid values!");
	return 0;
	}
	if(rate<= 0) {
		System.out.println("Invalid rate!");
		return 0;
	}
	int totalPay= hours*rate;
	return totalPay;
	
	
	
		
	}
	
}

