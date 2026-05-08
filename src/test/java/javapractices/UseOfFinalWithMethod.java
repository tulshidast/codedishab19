package javapractices;

public class UseOfFinalWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Parent {
	public final void display() {
		System.out.println("This is display method of Parent class");
	}

	public void show() {
		System.out.println("This is show method of Parent class");
	}
}

class Child extends Parent {
	// compile time error because we can't override final method
	public void display() {
		System.out.println("This is display method of Child class");
	}

	public void show() {
		System.out.println("This is show method of Child class");
	}
}
