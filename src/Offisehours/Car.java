package Offisehours;

public class Car {
String make, model, price;

//CMD+N MAC
//CTRL+ N windows
public Car(String mmake, String model, String price) {
	make= mmake;
	this.model= model;
	this.price= price;
}
	public void setPrice(String price) {
		this.price= price;
}
public String getMake() {
	return make;
}
public String getModel() {
	return model;
}
public String getPrice() {
	return price;
}
}
