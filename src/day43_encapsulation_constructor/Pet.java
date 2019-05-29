package day43_encapsulation_constructor;

public class Pet {
private String type;
private String name;

public Pet(String type, String name) {
	this.type= type;
	this.name=name;
}
public Pet() {
	System.out.println("No - args constructor");
}
public void speak() {
	switch (type.toLowerCase()) {
	case "cat":
		System.out.println("Muy");
		break;
	case "dog":
		System.out.println("gav,gav |woof woof | waw waw");
		break;
	case "bird":
		System.out.println("chick chik");
		break;
	case "goat":
		System.out.println("meee,mee");
		break;
	case "sheep":
		System.out.println("beee,beee");
		break;
	case "rooster":
		System.out.println("kukuku");
		break;
		default:
			System.out.println("");
		
		
		}
}
public String toString() {
	return "Pet [type=" + type + ", name=" + name + "]";
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
