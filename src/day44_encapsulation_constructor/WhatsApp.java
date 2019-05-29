package day44_encapsulation_constructor;

public class WhatsApp {
private String toNumber;
private String message;
private boolean delivered;



public String toString() {
	return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
}
public WhatsApp() {
	System.out.println("No- args constuctor");
}
public WhatsApp(String toNumber, String message) {
	this();//we have only one  this keyword
	System.out.println("2 Args constractor");
	this.message= message;
	this.toNumber=toNumber;
}

public WhatsApp(String toNumber) {
	//toNumber,[]
	//this.toNumber= toNumber;
	//this.message= "[]";
	this(toNumber,"[]");
	System.out.println("1 arg constructor");
}
public String getToNumber() {
	return toNumber;
	
	
}
public void setToNumber(String toNumber) {
	this.toNumber = toNumber;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public boolean isDelivered() {
	return delivered;
}
public void setDelivered(boolean delivered) {
	this.delivered = delivered;
}

}
