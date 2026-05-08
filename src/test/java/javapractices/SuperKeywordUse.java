package javapractices;

public class SuperKeywordUse {

	public static void main(String[] args) {
		ChildSuper1 c1 = new ChildSuper1("John");
		c1.display();
	}

}

class ParentSuper1 {

	int a = 10;

	ParentSuper1(String name) {
		System.out.println("Parent class constructor");

	}

	public void test() {
		System.out.println("This is a test method in parent class.");
	}
}

class ChildSuper1 extends ParentSuper1 {

	int a = 20;

	ChildSuper1(String name) {
		super(name); // super() is used to call the parent class constructor. It must be the first
						// statement in the constructor.
		System.out.println("Child class constructor");
	}

	void display() {
		super.test(); // super is used to call the parent class method. It is optional to use super
						// keyword when calling the method, but it is used here for demonstration
						// purposes.
		System.out.println("Value of a in child class: " + (super.a + a));
	}
}
