package day18;

class Parent {
	String name = "John";

	void m1() {
		System.out.println("this is m1 from parent.");
	}
}

class Child extends Parent {
	int id = 10;

	void m2() {
		System.out.println("this is m2 from child");

	}
}

public class TypeCastingObject1 {

	public static void main(String[] args) {
		// Below is one way
//		// TODO Auto-generated method stub
//		Child c = new Child();
//		System.out.println(c.name);
//		c.m1();
//		System.out.println(c.id);
//		c.m2();

		Parent p = new Child(); // this is upcasting as we storing child object in higher which is parent
		System.out.println(p.name);
		p.m1();
		// System.out.println(p.id);// we cannot access child as Reference type is of
		// Parent
		// p.m2();

		// Child c = new Parent();// will get error,to store large into small we need to
		// do explicitly downcasting
		// as below
		Parent p1 = new Parent();
		Child c = (Child) p1;
		System.out.println(c.name);
		c.m1();
		System.out.println(c.id);
		c.m2();

	}

}
