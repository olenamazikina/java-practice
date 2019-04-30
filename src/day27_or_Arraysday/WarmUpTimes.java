package day27_or_Arraysday;

public class WarmUpTimes {
	public static void main(String[] args) {
	
				//declare two int arrays time1, time2
				//hours 1-24
				//minutes 0-59
	    int [] time1= new int [2];//0,0 by default
		int [] time2= new int [2];	//0,0 by default
		//{20,45}hour 
		//{15,33}minute

		//System.out.println([0]);//0
		time1 [0]=22;
		time1[1]=15;
		
	    time2[0]=16;
	    time2[1]=10;
	    //before compare.check if both arrays have valid hour/minute
	    if(time1[0]<0 || time1[0]>23) {
	    	System.out.println("Time1 has invalid hour");
	    	return;
	    }
	    if(time1[1]<0 || time1[1]>59) {
	    	System.out.println("Time1 has invalid minute");
	    	return;
	}
	    if(time2[0]<0 || time2[0]>23) {
	    	System.out.println("Time2 has invalid hour");
	    	return;
	    }
	    if(time2[1]<0 || time2[1]>59) {
	    	System.out.println("Time2 has invalid minute");
	    	return;
	    }
	    	//compare arrays and tell which one is earlier
	    	//compare hours
	    	if(time1[0]<time2[0]) {
	    		System.out.println("Time1 is earlier");
	    	}else if (time2[0]<time1[0]) {
	    		System.out.println("Time2 is earlier");
	    	}else {//hours are equal, check minutes
	    		if(time1[1]<time2[1]) {
	    			System.out.println("Time1 is eaelier");
	    		}else if (time2[1]<time1[1] ){
	    			System.out.println("Time2 is earlier");
	    			}else {
	    				
	    	System.out.println("Same time!");	
	    	}

}
}
}