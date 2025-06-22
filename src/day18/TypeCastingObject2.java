package day18;

class Animal {
}

class Dog extends Animal {

}

class Cat extends Animal {

}

public class TypeCastingObject2 {
	public static void main(String[] args) {
		// Animal al = new Animal(); // correct
		Animal an = new Dog();// correct
		// Cat cn = (Cat) an;

		Dog dg = (Dog) an; // valid

	}
}
