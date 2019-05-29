package day41_ArrayList;

public class Mycar {
	public static void main(String[] args) {
		Car car1= new Car();
		car1.make="Ford";
		car1.model = "Fiesta";
		car1.color= "Grey";
		car1.currentSpeed= 55;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(45);
		car1.drive();
		System.out.println("before:"+car1.currentSpeed);
		car1.accellerate(20);
		System.out.println("after:"+car1.currentSpeed);
		BMW bmw = new BMW();
		System.out.println(bmw.make);
		bmw.model="m3";
		bmw.showPrice();
		System.out.println("Car Price :"+bmw.price);
		
		BMW bmw2= new BMW();//if not in notes
		bmw.model= "x3";
		bmw.showPrice();
	}

}
