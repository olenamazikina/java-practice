package day50_InheritanceOOPday3;

public class Dog extends Animal{
	public void speak(){
	System.out.println("Dog is saing gav gav");
	}
	public void move(int steps) {
		System.out.println("Dog is moving "+steps+" steps");
	}
}
