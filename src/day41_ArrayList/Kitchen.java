package day41_ArrayList;

public class Kitchen {
	public static void main(String[] args) {
		Microwave mic = new Microwave();
		mic.brand= "LG";
		mic.turnOn();
		mic.heat(" pizza with musrooms");
		mic.turnOff();
	}

}
