package day51_Inheritancday4;

public class Snowboarding extends Exercise {
public int perform (int minutes) {
	int cals=super.perform(10);//call superclass version of perform
	System.out.println("Snowboarding for "+minutes+" minutes");
	return minutes*7+cals;//go to super class calcul(10*4=40 cals) there and came back 
	                        //here and plus cals=700+40 =740   
}
}
