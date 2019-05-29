package day52_Inheritancday5;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE=310;//or you can put =310 in constractor
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	public final String JAN= "January";
public static final String COMPANY_NAME="Cybertec";
public static final String ADMIN_USERNAME;

static{ 
	ADMIN_USERNAME= "asdf@gmail.com";
}
	public FinalVariables() {
		MODEL_3_MAX_SPEED=180;
		
	}
	{
		MODEL_X_PASSENGERS=6;
	
	}
	public static void main(String[] args) {
	final	int MAX_PASSENGERS_COUNT=5;	//local variable in side of method,
	//can not be static or have access modifier
	//MAX_PASSENGERS_COUNT=10;it will not compailer changed
	final double PI=3.1459;
	//PI=4.667
	System.out.println(MAX_PASSENGERS_COUNT);
	final int SSN;
	SSN=234532666;
	FinalVariables finalVars= new FinalVariables();
	System.out.println("Max range for  roadster: "+finalVars.ROADSTER_MAX_RANGE);
	System.out.println("Max speed for model 3:"+finalVars.MODEL_3_MAX_SPEED);
	System.out.println("Max passenger for model X:"+finalVars.MODEL_X_PASSENGERS);
	System.out.println(Integer.MAX_VALUE);
	System.out.println("Company name:"+COMPANY_NAME);
	//System.out.println("Company name:"+FinalVariables+COMPANY_NAME);
	
}
}
