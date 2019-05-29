package day41_ArrayList;

public class Microwave {
String brand;
boolean isOn;//false.true=>on,

public void turnOn() {
	
	if(isOn==true) {
		System.out.println(brand+"  microwave is already on");
	}else {
		System.out.println("Turing on "+brand+" microwave");
		isOn= true;
	}
}
		public void turnOff( ) {
			if(isOn==true) {
				System.out.println(brand+" microwave is already on");
			}else {
				System.out.println("Turing on "+brand+" microwave");
				isOn= true;		
			}
		}
			
			public void heat(String food) {
				if(isOn) {
					System.out.println("Heating"+food);
				}else {
					System.out.println("Microwave is OFF, cannot heat " + food);	
			}
		}
}

