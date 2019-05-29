package day50_InheritanceOOPday3;

public class TestAnimal {
	public static void main(String[] args) {
		Animal an= new Animal();
		Cat cat= new Cat();
		Dog dog = new Dog();
		Duck duck= new Duck();
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		an.move(23);
		cat.move(12);
		dog.move(67);
		duck.move(32);
	}
	}


