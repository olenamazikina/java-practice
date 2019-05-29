package day49_Inheritance02;

import day49_Inheritance2.Device;
//Non sub class in different packege
public class OverSeasFactory {
	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand= "Samsung";
		//dv.model="3200";//not visible it is protected only sub classes
		
		//dv.price=100; not visible
		//dv.country="ELSalvador";//not visible
	}

}
