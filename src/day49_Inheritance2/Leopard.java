package day49_Inheritance2;

public class Leopard extends Animal {
	public Leopard() {
		super();//call parent class no ars constractor
		System.out.println("Leopard constractor");
		setType ("Leopard");
	}
	public Leopard(String type) {
		super(type);//call animal string type
		System.out.println("Leopard one arg constractor");

		

}
}